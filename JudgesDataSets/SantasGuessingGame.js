// Santa's Guessing Game generates input and output test cases on the fly because of the problem type.
// This javascript file implements the codescrim custom I/O interface so that it can determine a winner without needing an input and output file.

/**
 * Creates text input for submitted program before runtime
 * @param {Object} context - Information about submitted program including unique usr number (which should be used for Random seeds) 
 * @return {String} textInput - String that will be fed to program at startup.
 */
var iterCount

exports.generateTextInputBeforeRuntime = function(context){
	iterCount = 0;
	return "100000000\n";
}

/**
 * Callback for whenever submitted program outputs something to stdout.
 * @param {Object} context - Information about submitted program including unique usr number (which should be used for Random seeds) 
 * @param {String} data - Most recent output of the program (Suggestion: use String.trim() to make it more usable)
 * @param {Function} writeToInput({String} textToWrite) - Write to running program's input
 * @param {Function} accept() - Consider attempt correct. Running program will be terminated, and points will be awarded.
 * @param {Function} reject() - Consider attempt incorrect. Running program will be terminated.
 * @return {null}
 */
exports.onProgramOutput = function(context, data, writeToInput, accept, reject){
	if(iterCount <= 26){
		var i = parseInt(data.trim());
		if(data.trim() == '')
			return;
	    if(i > 100000000){
	    	writeToInput("LOWER\n");
	    }else if(i < 100000000){
	    	writeToInput("HIGHER\n");
	    }else{
	    	writeToInput("CORRECT\n");
	    	accept();
	    }
	}else{
		reject()
	}
	iterCount += 1;
}

/**
 * Callback for whenever submitted program finishes running. Here you can look at programs output and determine if output it is correct or not
 * @param {Object} context - Information about submitted program including unique usr number (which should be used for Random seeds) 
 * @param {String} data - Full output of the program (Suggestion: use String.trim() to make it more usable)
 * @return {bool} - true if problem solved correctly, false if problem is not solved correctly
 */
exports.onProgramFullOutput = function(context, data, accept, reject){
	
}
