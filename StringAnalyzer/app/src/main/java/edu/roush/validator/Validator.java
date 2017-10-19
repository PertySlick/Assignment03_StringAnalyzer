/* Name: Timothy Roush
 * Date: 10/18/17
 * Filename: Validator.java
 * Assignment: #3 Bug Fixes
 * Description: Provides validation methods for making sure input fields meet
 *              specific input requirements
 */

package edu.roush.validator;

import android.widget.EditText;

/**
 * Provides customized methods for performing validation on specified inputs.
 *
 * @author Timothy Roush
 * @version 1.0
 */

public class Validator {


// METHODS


    public boolean hasStringInput(EditText field) {
        String input = field.getText().toString().trim();
        return input.length() > 0;
    }
}
