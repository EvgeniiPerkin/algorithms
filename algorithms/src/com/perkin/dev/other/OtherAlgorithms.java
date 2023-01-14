package com.perkin.dev.other;

import java.util.HashMap;
import java.util.Map;

import edu.princeton.cs.algs4.StdOut;

public class OtherAlgorithms {
	public void Run() {
		StdOut.print(romanToInt("MCCCLII"));
		//StdOut.printf(convertStr("AADDSAASDFDDDDDSSSASADFG"));
	}
	/**
	 * на входе строка содержит символы
	 * "AAADKJJKJLKSDFHHHHSLKJKKK"
	 * Необходимо в случае повторения символов указать их колличество
	 * на выходе строка должна быть в виде
	 * "A3DKJ2KJKSDF"
	 * @param str
	 * @return
	 */
	public String convertStr(String str) {
		String result = "";
		
		if (str.length() == 1) {
			return str;
		}
		
		char old = ' ';
		int count = 1;
		
		for (int i = 0; i < str.length(); i++) {
			if (old == ' ') {
				old = str.charAt(i);
				result += old;
				continue;
			}
			
			char next = str.charAt(i);
			
			if (next == old) { 
				count++;
				if (i == str.length() - 1) {
					result += count;
				}
			} else {
				if (count != 1) {
					result += count;
				}
				result += next;
				count = 1;
			}
			
			old = str.charAt(i);		
		}
		
		return result;
	}
	
	private static Map<Integer, Character> symbols = new HashMap<Integer, Character>(){{
        put(1, 'I');
        put(5, 'V');
        put(10, 'X');
        put(50, 'L');
        put(100, 'C');
        put(500, 'D');
        put(1000, 'M');
    }};

    /**
     * преобразует римские числа в десятичные
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int result = 0;
        
        char before = ' ';

        for (int i = 0; i < s.length(); i++) {
            char after = s.charAt(i);

            if (before != ' ') {
                switch(before) {
                    case 'I':
                        if (after == 'V') {
                            result += 3;
                        } else if (after == 'X') {
                            result += 8;
                        } else {
                            result += getNumber(after);
                        }
                    break;
                    case 'X':
                        if (after == 'L') {
                            result += 30;
                        } else if (after == 'C') {
                            result += 80;
                        } else {
                            result += getNumber(after);
                        }
                    break;
                    case 'C':
                        if (after == 'D') {
                            result += 300;
                        } else if (after == 'M') {
                            result += 800;
                        } else {
                            result += getNumber(after);
                        }
                    break;
                    default:
                        result += getNumber(after);
                    break;
                }
            } else {
                result += getNumber(after);
            }

            before = s.charAt(i);  
        }

        return result;
    }

    public int getNumber(Character ch) {
        for (Map.Entry<Integer, Character> symbol : symbols.entrySet()) {
            if (symbol.getValue() == ch) {
                return symbol.getKey();
            }
        }
        return 0;
    }
}
