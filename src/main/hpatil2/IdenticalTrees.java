package main.hpatil2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.exit;
import static java.lang.System.in;

/**
 * Created by HarshPatil on 11/17/16.
 */
public class IdenticalTrees {

    public static void main(String args[]) throws Exception {

        Tree firstTree = new Tree();
        Tree secondTree = new Tree();

        System.out.println("Enter size of the first binary search Tree");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int firstTreeSize = Integer.parseInt(bufferedReader.readLine());

        int start = 0;
        while (start != firstTreeSize){
            System.out.println("Enter element : "+ start);
            int input = Integer.parseInt(bufferedReader.readLine());
            firstTree.insert(input);
            start++;
        }

        System.out.println("Elements of first binary search tree ::: ");
        firstTree.printInputTree();

        System.out.println("\nEnter Size of the second binary search tree");
        int secondTreeSize = Integer.parseInt(bufferedReader.readLine());

        if(secondTreeSize != firstTreeSize) {

            System.out.println("Two trees are not identical");
            exit(0);
        } else {

            start = 0;
            while (start != secondTreeSize){

                System.out.println("Enter element : "+start);
                int input = Integer.parseInt(bufferedReader.readLine());
                secondTree.insert(input);
                start++;
            }

            System.out.println("Elements of second binary search tree ::: ");
            secondTree.printInputTree();
        }

        firstTree.identicalTest(firstTree, secondTree);
    }

}
