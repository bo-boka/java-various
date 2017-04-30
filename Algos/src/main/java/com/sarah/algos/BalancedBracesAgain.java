/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos;

/*
 * @author Sarah
 */

public class BalancedBracesAgain {
//    Write a function that takes a string of arbitrary characters and returns true if all brackets (defined as parentheses ‘()’, square brackets ‘[]’, curly braces ‘{}’ and angle brackets ‘<>’) are correctly paired and ordered.
//
//Examples:
//“123” => true (no brackets to match)
//“(foo)” => true (matching parentheses)
//“[<()=()>]” => true (four sets of matching brackets)
//“<node” => false (not closed)
//“(bar]” => false (mismatching bracket types)
//“([baz)]” => false (incorrect ordering)

HashMap<Character, Character> map ...
Stack stack = new Stack();

map.put('{', '}');
map.put('(', ')');
map.put('<', '>');


for (int i = 0; i < s.length; i++){
    if (map.contains(s.charAt(i)){
        stack.push(s.charAt(i))
    } else if (map.containsValue(s.charAt(i))) {
        if (stack.pop() =match= s.charAt(i)) {
            stack.pop();
        } else { 
            continue; 
        }
    }
     
}
}
