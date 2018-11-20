package digits;

import java.util.*;

/**
 *
 * @author Tim Barber
 */
public class Digits {

    public static void main(String[] args) {
        System.out.println("Copyright (c) 2018 Tim Barber under the MIT License"); //Header

        String code = "";
        Scanner codeIter = new Scanner(code);
        ArrayList<Integer> stack = new ArrayList<>();
        stack.add(0);
        ArrayList<Integer> commands = new ArrayList<>();
        /*
         * OPCODES 0 - pop 1 - Push 1 on the stack 2 - duplicate top value 3 -
         * add top two values 4 - go back to specified label unless top is 0 5 -
         * jump to specified label unless top is 0 6 - 7 - 8 - 9 -
         */
        while (true) {
            if (!codeIter.hasNext()) {
                break;
            }
            int thisCommand = codeIter.nextInt();
            commands.add(thisCommand);
            DigitsParser.eval(thisCommand, stack);
        }

    }
}

/*
 * The MIT License
 *
 * Copyright (c) 2018 Tim Barber.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
