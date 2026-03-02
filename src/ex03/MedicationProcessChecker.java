package ex03;

import java.util.Stack;

public class MedicationProcessChecker {
    Stack<String> stack = new Stack<String>();

    public boolean checkProcess (String[] actions) {
        for(int i = 0; i < actions.length; i++){
            String action = actions[i];

            if (action.equalsIgnoreCase("PUSH")) {
                stack.push(action);
            }else if (action.equalsIgnoreCase("POP")) {
                if (stack.isEmpty()){
                    System.out.println("Danh sách thuốc đang rỗng");
                    return false;
                }
                stack.pop();
            }else {
                System.out.println("Action không hợp lệ");
            }
        }
        if (!stack.isEmpty()){
            System.out.println("Danh sách thuốc vẫn còn");
            return false;
        }else {
            System.out.println("Quá trình hợp lệ");
            return true;
        }
    }

    public void reset () {
        stack.clear();
    }
}
