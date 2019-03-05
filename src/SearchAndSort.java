import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchAndSort {
	public Scanner input = new Scanner(System.in);
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) throws IOException {
		SearchAndSort s = new SearchAndSort();
		String option;
		do {
			System.out.println("What algorithm would you like to execute? Acceptable responses: bubble, selection, insertion, merge, linear, binary, quit");
			option = s.input.nextLine();
			try{
				
				if (option.toLowerCase().equals("bubble")) {
					String datatype;
					do {
						System.out.println("What type of data? Acceptable responses: integers, strings.");
						datatype = s.input.nextLine();
						try{
							
							if (datatype.toLowerCase().equals("integers")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													Integer[] arrayInt = new Integer[data.split(",").length];
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt[i] = Integer.parseInt(data.split(",")[i]);
													}
													System.out.println("Bubble Sort: " + Arrays.toString(s.bubbleSort(arrayInt, arrayInt[0])));
													next = true;
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													ArrayList<Integer> arrayInt = new ArrayList<Integer>();
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt.add(Integer.parseInt(data.split(",")[i]));
													}
													System.out.println("Bubble Sort: " + s.bubbleSort(arrayInt, arrayInt.get(0)).toString());
													next = true;
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
							else if (datatype.toLowerCase().equals("strings")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												
												try{
													String[] arrayString = new String[data.split(",").length];
													boolean invalid = false;
													arrayString = data.split(",");
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString[i].toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														System.out.println("Bubble Sort: " + Arrays.toString(s.bubbleSort(arrayString, arrayString[0])));
														next = true;
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												try{
													ArrayList<String> arrayString = new ArrayList<String>();
													boolean invalid = false;
													for (int i = 0; i < data.split(",").length; i++){
														arrayString.add(i, data.split(",")[i]);
													}
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString.get(i).toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														System.out.println("Bubble Sort: " + s.bubbleSort(arrayString, arrayString.get(0)).toString());
														next = true;
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
						
						}catch (NumberFormatException e){
							System.out.println("Invalid Input");
						}
					} while (!datatype.toLowerCase().equals("integers") && !datatype.toLowerCase().equals("strings"));
				}
				else if (option.toLowerCase().equals("selection")) { 
					String datatype;
					do {
						System.out.println("What type of data? Acceptable responses: integers, strings.");
						datatype = s.input.nextLine();
						try{
							
							if (datatype.toLowerCase().equals("integers")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													Integer[] arrayInt = new Integer[data.split(",").length];
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt[i] = Integer.parseInt(data.split(",")[i]);
													}
													System.out.println("Selection Sort: " + Arrays.toString(s.selectionSort(arrayInt, arrayInt[0])));
													next = true;
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													ArrayList<Integer> arrayInt = new ArrayList<Integer>();
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt.add(Integer.parseInt(data.split(",")[i]));
													}
													System.out.println("Selection Sort: " + s.selectionSort(arrayInt, arrayInt.get(0)).toString());
													next = true;
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
							else if (datatype.toLowerCase().equals("strings")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												
												try{
													String[] arrayString = new String[data.split(",").length];
													boolean invalid = false;
													arrayString = data.split(",");
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString[i].toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														System.out.println("Selection Sort: " + Arrays.toString(s.selectionSort(arrayString, arrayString[0])));
														next = true;
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												try{
													ArrayList<String> arrayString = new ArrayList<String>();
													boolean invalid = false;
													for (int i = 0; i < data.split(",").length; i++){
														arrayString.add(i, data.split(",")[i]);
													}
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString.get(i).toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														System.out.println("Selection Sort: " + s.selectionSort(arrayString, arrayString.get(0)).toString());
														next = true;
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
						
						}catch (NumberFormatException e){
							System.out.println("Invalid Input");
						}
					} while (!datatype.toLowerCase().equals("integers") && !datatype.toLowerCase().equals("strings"));
				}
				else if (option.toLowerCase().equals("insertion")) { 
					String datatype;
					do {
						System.out.println("What type of data? Acceptable responses: integers, strings.");
						datatype = s.input.nextLine();
						try{
							
							if (datatype.toLowerCase().equals("integers")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													Integer[] arrayInt = new Integer[data.split(",").length];
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt[i] = Integer.parseInt(data.split(",")[i]);
													}
													System.out.println("Insertion Sort: " + Arrays.toString(s.insertionSort(arrayInt, arrayInt[0])));
													next = true;
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													ArrayList<Integer> arrayInt = new ArrayList<Integer>();
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt.add(Integer.parseInt(data.split(",")[i]));
													}
													System.out.println("Insertion Sort: " + s.insertionSort(arrayInt, arrayInt.get(0)).toString());
													next = true;
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
							else if (datatype.toLowerCase().equals("strings")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												
												try{
													String[] arrayString = new String[data.split(",").length];
													boolean invalid = false;
													arrayString = data.split(",");
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString[i].toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														System.out.println("Insertion Sort: " + Arrays.toString(s.insertionSort(arrayString, arrayString[0])));
														next = true;
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												try{
													ArrayList<String> arrayString = new ArrayList<String>();
													boolean invalid = false;
													for (int i = 0; i < data.split(",").length; i++){
														arrayString.add(i, data.split(",")[i]);
													}
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString.get(i).toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														System.out.println("Insertion Sort: " + s.insertionSort(arrayString, arrayString.get(0)).toString());
														next = true;
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
						
						}catch (NumberFormatException e){
							System.out.println("Invalid Input");
						}
					} while (!datatype.toLowerCase().equals("integers") && !datatype.toLowerCase().equals("strings"));
				}
				else if (option.toLowerCase().equals("merge")) { 
					String datatype;
					do {
						System.out.println("What type of data? Acceptable responses: integers, strings.");
						datatype = s.input.nextLine();
						try{
							
							if (datatype.toLowerCase().equals("integers")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													Integer[] arrayInt = new Integer[data.split(",").length];
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt[i] = Integer.parseInt(data.split(",")[i]);
													}
													System.out.println("Merge Sort: " + Arrays.toString(s.mergeSort(arrayInt, arrayInt[0])));
													next = true;
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													ArrayList<Integer> arrayInt = new ArrayList<Integer>();
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt.add(Integer.parseInt(data.split(",")[i]));
													}
													System.out.println("Merge Sort: " + s.mergeSort(arrayInt, arrayInt.get(0)));
													next = true;
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
							else if (datatype.toLowerCase().equals("strings")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												
												try{
													String[] arrayString = new String[data.split(",").length];
													boolean invalid = false;
													arrayString = data.split(",");
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString[i].toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														System.out.println("Merge Sort: " + Arrays.toString(s.mergeSort(arrayString, arrayString[0])));//TODO problem
														next = true;
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												try{
													ArrayList<String> arrayString = new ArrayList<String>();
													boolean invalid = false;
													for (int i = 0; i < data.split(",").length; i++){
														arrayString.add(i, data.split(",")[i]);
													}
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString.get(i).toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														System.out.println("Merge Sort: " + s.mergeSort(arrayString, arrayString.get(0)).toString());
														next = true;
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
						
						}catch (NumberFormatException e){
							System.out.println("Invalid Input");
						}
					} while (!datatype.toLowerCase().equals("integers") && !datatype.toLowerCase().equals("strings"));
				}
				else if (option.toLowerCase().equals("linear")) { //TODO
					String datatype;
					do {
						System.out.println("What type of data? Acceptable responses: integers, strings.");
						datatype = s.input.nextLine();
						try{
							
							if (datatype.toLowerCase().equals("integers")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													Integer[] arrayInt = new Integer[data.split(",").length];
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt[i] = Integer.parseInt(data.split(",")[i]);
													}
													next = true;
													// Start
													int target;
													String lastInput;
													boolean nextFinal = false;
													do{
														System.out.println("Enter your target");
														lastInput = s.input.nextLine();
														try {
															target = Integer.parseInt(lastInput);
															System.out.println("Linear Search: element index " + s.linearSearch(arrayInt, arrayInt[0], target));
															nextFinal = true;
														}catch(NumberFormatException e){
															System.out.print("Invalid Input");
														}
													}while(!nextFinal);
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													ArrayList<Integer> arrayInt = new ArrayList<Integer>();
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt.add(Integer.parseInt(data.split(",")[i]));
													}
													//System.out.println("Linear Search: " + s.linearSearch(arrayInt, arrayInt.get(0)).toString());
													next = true;
													int target;
													String lastInput;
													boolean nextFinal = false;
													do{
														System.out.println("Enter your target");
														lastInput = s.input.nextLine();
														try {
															target = Integer.parseInt(lastInput);
															System.out.println("Linear Search: element index " + s.linearSearch(arrayInt, arrayInt.get(0), target));
															nextFinal = true;
														}catch(NumberFormatException e){
															System.out.print("Invalid Input");
														}
													}while(!nextFinal);
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
							else if (datatype.toLowerCase().equals("strings")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												
												try{
													String[] arrayString = new String[data.split(",").length];
													boolean invalid = false;
													arrayString = data.split(",");
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString[i].toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														//System.out.println("Linear Search: " + Arrays.toString(s.linearSearch(arrayString, arrayString[0])));
														next = true;
														String target;
														String lastInput;
														boolean nextFinal = false;
														do{
															System.out.println("Enter your target");
															lastInput = s.input.nextLine();
															try {
																target = lastInput;
																System.out.println("Linear Search: element index " + s.linearSearch(arrayString, arrayString[0], target));
																nextFinal = true;
															}catch(NumberFormatException e){
																System.out.print("Invalid Input");
															}
														}while(!nextFinal);
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												try{
													ArrayList<String> arrayString = new ArrayList<String>();
													boolean invalid = false;
													for (int i = 0; i < data.split(",").length; i++){
														arrayString.add(i, data.split(",")[i]);
													}
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString.get(i).toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														//System.out.println("Linear Search: " + s.linearSearch(arrayString, arrayString.get(0)).toString());
														next = true;
														String target;
														String lastInput;
														boolean nextFinal = false;
														do{
															System.out.println("Enter your target");
															lastInput = s.input.nextLine();
															try {
																target = lastInput;
																System.out.println("Linear Search: element index " + s.linearSearch(arrayString, arrayString.get(0), target));
																nextFinal = true;
															}catch(NumberFormatException e){
																System.out.print("Invalid Input");
															}
														}while(!nextFinal);
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
						
						}catch (NumberFormatException e){
							System.out.println("Invalid Input");
						}
					} while (!datatype.toLowerCase().equals("integers") && !datatype.toLowerCase().equals("strings"));
				}
				else if (option.toLowerCase().equals("binary")) { //TODO
					String datatype;
					do {
						System.out.println("What type of data? Acceptable responses: integers, strings.");
						datatype = s.input.nextLine();
						try{
							
							if (datatype.toLowerCase().equals("integers")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													Integer[] arrayInt = new Integer[data.split(",").length];
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt[i] = Integer.parseInt(data.split(",")[i]);
													}
													//System.out.println("Binary Search: " + Arrays.toString(s.binarySearch(arrayInt, arrayInt[0])));
													next = true;
													int target;
													String lastInput;
													boolean nextFinal = false;
													do{
														System.out.println("Enter your target");
														lastInput = s.input.nextLine();
														try {
															target = Integer.parseInt(lastInput);
															arrayInt = s.bubbleSort(arrayInt, arrayInt[0]);
															System.out.println("Binary Search: element index " + s.binarySearch(arrayInt, arrayInt[0], 0, arrayInt.length -1, target));
															nextFinal = true;
														}catch(NumberFormatException e){
															System.out.print("Invalid Input");
														}
													}while(!nextFinal);
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5)");
												data = s.input.nextLine();
												try{
													ArrayList<Integer> arrayInt = new ArrayList<Integer>();
													for (int i = 0; i < data.split(",").length; i++){
														arrayInt.add(Integer.parseInt(data.split(",")[i]));
													}
													//System.out.println("Binary Search: " + s.binarySearch(arrayInt, arrayInt.get(0)).toString());
													next = true;
													int target;
													String lastInput;
													boolean nextFinal = false;
													do{
														System.out.println("Enter your target");
														lastInput = s.input.nextLine();
														try {
															target = Integer.parseInt(lastInput);
															arrayInt = s.bubbleSort(arrayInt, arrayInt.get(0));
															System.out.println("Binary Search: element index " + s.binarySearch(arrayInt, arrayInt.get(0), 0, arrayInt.size() -1, target));
															nextFinal = true;
														}catch(NumberFormatException e){
															System.out.print("Invalid Input");
														}
													}while(!nextFinal);
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
							else if (datatype.toLowerCase().equals("strings")) {
								String storage;
								do {
									System.out.println("How is it stored? Acceptable responses: array, list.");
									storage = s.input.nextLine();
									try{
										if (storage.toLowerCase().equals("array")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												
												try{
													String[] arrayString = new String[data.split(",").length];
													boolean invalid = false;
													arrayString = data.split(",");
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString[i].toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														//System.out.println("Binary Search: " + Arrays.toString(s.binarySearch(arrayString, arrayString[0])));
														next = true;
														String target;
														String lastInput;
														boolean nextFinal = false;
														do{
															System.out.println("Enter your target");
															lastInput = s.input.nextLine();
															try {
																target = lastInput;
																arrayString = s.bubbleSort(arrayString, arrayString[0]);
																System.out.println("Binary Search: element index " + s.binarySearch(arrayString, arrayString[0], 0, arrayString.length -1, target));
																nextFinal = true;
															}catch(NumberFormatException e){
																System.out.print("Invalid Input");
															}
														}while(!nextFinal);
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										} else if (storage.toLowerCase().equals("list")){
											boolean next = false;
											String data;
											do{
												System.out.println("Enter the data. Acceptable responses: a comma-delimited list of data (i.e., a,b,A,B,AB)");
												data = s.input.nextLine();
												try{
													ArrayList<String> arrayString = new ArrayList<String>();
													boolean invalid = false;
													for (int i = 0; i < data.split(",").length; i++){
														arrayString.add(i, data.split(",")[i]);
													}
													for (int i = 0; i < data.split(",").length; i++){
														for (char c: arrayString.get(i).toCharArray()){
															if (!Character.isLetter(c)){
																invalid = true;
															}
														}
													}
													
													if (!invalid){
														//System.out.println("Binary Search: " + s.binarySearch(arrayString, arrayString.get(0)).toString());
														next = true;
														String target;
														String lastInput;
														boolean nextFinal = false;
														do{
															System.out.println("Enter your target");
															lastInput = s.input.nextLine();
															try {
																target = lastInput;
																arrayString = s.bubbleSort(arrayString, arrayString.get(0));
																System.out.println("Binary Search: element index " + s.binarySearch(arrayString, arrayString.get(0), 0, arrayString.size() -1, target));
																nextFinal = true;
															}catch(NumberFormatException e){
																System.out.print("Invalid Input");
															}
														}while(!nextFinal);
													}else{
														System.out.println("Invalid Input");
													}
												}catch(NumberFormatException e){
													System.out.println("Invalid Input");
												}
											}while (!next);
										}
									}catch (NumberFormatException e){
										
									}
								} while (!storage.toLowerCase().equals("array") && !storage.toLowerCase().equals("list"));
							}
						
						}catch (NumberFormatException e){
							System.out.println("Invalid Input");
						}
					} while (!datatype.toLowerCase().equals("integers") && !datatype.toLowerCase().equals("strings"));
				}else if(!option.toLowerCase().equals("quit")){
					System.out.println("Invalid Input");
				}
			
			}catch (NumberFormatException e){
				System.out.println("Invalid Input");
			}
		} while (!option.toLowerCase().equals("quit"));
	}
	
	public Integer[] bubbleSort(Integer intArray[], Integer firstElement){
		int i;
		int j;
		int n = intArray.length;
		   for (i = 0; i < n-1; i++) {    
		  
		       for (j = 0; j < n-i-1; j++) { 
		           if (intArray[j] > intArray[j+1]) {
		        	   Integer temp = intArray[j];
		        	   intArray[j] = intArray[j+1];
		        	   intArray[j+1] = temp;
		           }
		       }
		   }
		return intArray;
	}
	
	public String[] bubbleSort(String stringArray[], String firstElement){
		Collator myCollator = Collator.getInstance();
		int i;
		int j;
		int n = stringArray.length;
		   for (i = 0; i < n-1; i++) {    
		  
		       for (j = 0; j < n-i-1; j++) { 
		           if (myCollator.compare(stringArray[j], stringArray[j+1]) > 0) {
		        	   String temp = stringArray[j];
		        	   stringArray[j] = stringArray[j+1];
		        	   stringArray[j+1] = temp;
		           }
		       }
		   }
		return stringArray;
	}
	
	public ArrayList<Integer> bubbleSort(ArrayList<Integer> intArray, Integer firstElement){
		int i;
		int j;
		int n = intArray.size();
		   for (i = 0; i < n-1; i++) {    
		  
		       for (j = 0; j < n-i-1; j++) { 
		           if (intArray.get(j) > intArray.get(j+1)) {
		        	   Integer temp = intArray.get(j);
		        	   intArray.set(j, intArray.get(j+1));
		        	   intArray.set(j+1, temp);
		           }
		       }
		   }
		return intArray;
		
	}
	
	public ArrayList<String> bubbleSort(ArrayList<String> stringArray, String firstElement){
		Collator myCollator = Collator.getInstance();
		int i;
		int j;
		int n = stringArray.size();
		   for (i = 0; i < n-1; i++) {    
		  
		       for (j = 0; j < n-i-1; j++) { 
		           if (myCollator.compare(stringArray.get(j), stringArray.get(j+1)) > 0) {
		        	   String temp = stringArray.get(j);
		        	   stringArray.set(j, stringArray.get(j+1));
		        	   stringArray.set(j+1, temp);
		           }
		       }
		   }
		return stringArray;
	}
	
	public Integer[] selectionSort(Integer intArray[], Integer firstElement){
		int n = intArray.length; 
		for (int i = 0; i < n-1; i++)   { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) {
            	 if (intArray[j] < intArray[min_idx]) {
            		 min_idx = j; 
            	 }
            }
            // Swap the found minimum element with the first 
            // element 
            int temp = intArray[min_idx]; 
            intArray[min_idx] = intArray[i]; 
            intArray[i] = temp; 
        } 
		return intArray;
	}
	
	public String[] selectionSort(String stringArray[], String firstElement){
		Collator myCollator = Collator.getInstance();
		int n = stringArray.length; 
		for (int i = 0; i < n-1; i++)   { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) {
            	 if (myCollator.compare(stringArray[j], stringArray[min_idx]) < 0) {
            		 min_idx = j; 
            	 }
            }
            // Swap the found minimum element with the first 
            // element 
            String temp = stringArray[min_idx]; 
            stringArray[min_idx] = stringArray[i]; 
            stringArray[i] = temp; 
        } 
		return stringArray;
	}
	
	public ArrayList<Integer> selectionSort(ArrayList<Integer> intArray, Integer firstElement){
		int n = intArray.size(); 
		for (int i = 0; i < n-1; i++)   { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) {
            	 if (intArray.get(j) < intArray.get(min_idx)) {
            		 min_idx = j; 
            	 }
            }
            // Swap the found minimum element with the first 
            // element 
            int temp = intArray.get(min_idx); 
            intArray.set(min_idx, intArray.get(i)); 
            intArray.set(i, temp); 
        } 
		return intArray;
		
	}
	
	public ArrayList<String> selectionSort(ArrayList<String> stringArray, String firstElement){
		Collator myCollator = Collator.getInstance();
		int n = stringArray.size(); 
		for (int i = 0; i < n-1; i++)   { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) {
            	 if (myCollator.compare(stringArray.get(j) , stringArray.get(min_idx)) < 0) {
            		 min_idx = j; 
            	 }
            }
            // Swap the found minimum element with the first 
            // element 
            String temp = stringArray.get(min_idx); 
            stringArray.set(min_idx, stringArray.get(i)); 
            stringArray.set(i, temp);
        } 
		return stringArray;
	}
	
	public Integer[] insertionSort(Integer intArray[], Integer firstElement){
		int n = intArray.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = intArray[i]; 
            int j = i-1; 
  

            while (j>=0 && intArray[j] > key) 
            { 
                intArray[j+1] = intArray[j]; 
                j = j-1; 
            } 
            intArray[j+1] = key; 
        } 
		return intArray;
	}
	
	public String[] insertionSort(String stringArray[], String firstElement){
		Collator myCollator = Collator.getInstance();
		int n = stringArray.length; 
        for (int i=1; i<n; ++i) 
        { 
            String key = stringArray[i]; 
            int j = i-1; 
  

            while (j>=0 && myCollator.compare(stringArray[j], key) > 0) 
            { 
                stringArray[j+1] = stringArray[j]; 
                j = j-1; 
            } 
            stringArray[j+1] = key; 
        } 
		return stringArray;
	}
	
	public ArrayList<Integer> insertionSort(ArrayList<Integer> intArray, Integer firstElement){
		int n = intArray.size(); 
        for (int i=1; i<n; ++i) 
        { 
            int key = intArray.get(i); 
            int j = i-1; 
  

            while (j>=0 && intArray.get(i) > key) 
            { 
                intArray.set(j+1, intArray.get(j)); 
                j = j-1; 
            } 
            intArray.set(j+1, key); 
        } 
		return intArray;
		
	}
	
	public ArrayList<String> insertionSort(ArrayList<String> stringArray, String firstElement){
		Collator myCollator = Collator.getInstance();
		int n = stringArray.size(); 
        for (int i=1; i<n; ++i) 
        { 
            String key = stringArray.get(i); 
            int j = i-1; 
  

            while (j>=0 && myCollator.compare(stringArray.get(j), key) > 0) 
            { 
            	stringArray.set(j+1, stringArray.get(j)); 
                j = j-1; 
            } 
            stringArray.set(j+1, key); 
        } 
		return stringArray;
	}
	
	public Integer[] mergeSort(Integer[] intArray, Integer firstElement){
		int N = intArray.length; 
		int mid = (int) N/2;
        if (N < 2) {
        	return intArray; 
        }
        // recursively sort 
        Integer[] arr1 = new Integer[mid];
        for (int i =0; i < mid; i++){
        	arr1[i] = intArray[i];
        }
        Integer[] arr2 = new Integer[N-mid];
        for (int i = mid; i < N; i++){
        	arr2[i-mid] = intArray[i];
        }
        arr1 = mergeSort(arr1, arr1[0]); 
        arr2 = mergeSort(arr2, arr2[0]); 
        // merge two sorted subarrays
        
        
        int i = 0;
		int j = 0;
		int k = 0;
	    while (i < mid && j < (N-mid)) {
	        if (arr1[i] <= arr2[j]) {
	        	intArray[k++] = arr1[i++];
	        }
	        else {
	        	intArray[k++] = arr2[j++];
	        }
	    }
	    while (i < mid) {
	    	intArray[k++] = arr1[i++];
	    }
	    while (j < (N-mid)) {
	    	intArray[k++] = arr2[j++];
	    }
        
        
        return intArray;
        
	}
	
	public String[] mergeSort(String stringArray[], String firstElement){
		Collator myCollator = Collator.getInstance();
		int N = stringArray.length; 
		int mid = (int) N/2;
        if (N < 2) {
        	return stringArray; 
        }
        // recursively sort 
        String[] arr1 = new String[mid];
        for (int i =0; i < mid; i++){
        	arr1[i] = stringArray[i];
        }
        String[] arr2 = new String[N-mid];
        for (int i = mid; i < N; i++){
        	arr2[i-mid] = stringArray[i];
        }
        arr1 = mergeSort(arr1, arr1[0]); 
        arr2 = mergeSort(arr2, arr2[0]); 
        // merge two sorted subarrays
        
        
        int i = 0;
		int j = 0;
		int k = 0;
	    while (i < mid && j < (N-mid)) {
	        if (myCollator.compare(arr1[i], arr2[j]) <= 0) {
	        	stringArray[k++] = arr1[i++];
	        }
	        else {
	        	stringArray[k++] = arr2[j++];
	        }
	    }
	    while (i < mid) {
	    	stringArray[k++] = arr1[i++];
	    }
	    while (j < (N-mid)) {
	    	stringArray[k++] = arr2[j++];
	    }
        
        
        return stringArray;
	}
	
	public ArrayList<Integer> mergeSort(ArrayList<Integer> intArray, Integer firstElement){
		int N = intArray.size(); 
		int mid = (int) N/2;
        if (N < 2) {
        	return intArray; 
        }
        // recursively sort 
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for (int i =0; i < mid; i++){
        	arr1.add(intArray.get(i));
        }
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (int i = mid; i < N; i++){
        	arr2.add(intArray.get(i));
        }
        arr1 = mergeSort(arr1, arr1.get(0)); 
        arr2 = mergeSort(arr2, arr2.get(0)); 
        // merge two sorted subarrays
        
        
        int i = 0;
		int j = 0;
		int k = 0;
	    while (i < mid && j < (N-mid)) {
	        if (arr1.get(i) <= arr2.get(j)) {
	        	intArray.set(k++, arr1.get(i++));
	        }
	        else {
	        	intArray.set(k++, arr2.get(j++));
	        }
	    }
	    while (i < mid) {
	    	intArray.set(k++, arr1.get(i++));
	    }
	    while (j < (N-mid)) {
	    	intArray.set(k++, arr2.get(j++));
	    }
        
        
        return intArray;
	}

	public ArrayList<String> mergeSort(ArrayList<String> stringArray, String firstElement){
		Collator myCollator = Collator.getInstance();
		int N = stringArray.size(); 
		int mid = (int) N/2;
        if (N < 2) {
        	return stringArray; 
        }
        // recursively sort 
        ArrayList<String> arr1 = new ArrayList<String>();
        for (int i =0; i < mid; i++){
        	arr1.add(stringArray.get(i));
        }
        ArrayList<String> arr2 = new ArrayList<String>();
        for (int i = mid; i < N; i++){
        	arr2.add(stringArray.get(i));
        }
        arr1 = mergeSort(arr1, arr1.get(0)); 
        arr2 = mergeSort(arr2, arr2.get(0)); 
        // merge two sorted subarrays
        
        
        int i = 0;
		int j = 0;
		int k = 0;
	    while (i < mid && j < (N-mid)) {
	        if (myCollator.compare(arr1.get(i), arr2.get(j)) <= 0) {
	        	stringArray.set(k++, arr1.get(i++));
	        }
	        else {
	        	stringArray.set(k++, arr2.get(j++));
	        }
	    }
	    while (i < mid) {
	    	stringArray.set(k++, arr1.get(i++));
	    }
	    while (j < (N-mid)) {
	    	stringArray.set(k++, arr2.get(j++));
	    }
        
        
        return stringArray;
	}
	
	public int linearSearch(Integer intArray[], Integer firstElement, int target){
		for(int i = 0; i < intArray.length; i++)
	    {
	        if (intArray[i] == target) 
	        {       
	            return i; 
	        }
	    }
	    return -1;
	}
	
	public int linearSearch(String stringArray[], String firstElement, String target){
		for(int i = 0; i < stringArray.length; i++)
	    {
	        if (stringArray[i].equals(target)) 
	        {       
	            return i; 
	        }
	    }
	    return -1;
	}
	
	public int linearSearch(ArrayList<Integer> intArray, Integer firstElement, int target){
		for(int i = 0; i < intArray.size(); i++)
	    {
	        if (intArray.get(i) == target) 
	        {       
	            return i; 
	        }
	    }
	    return -1;
		
	}
	
	public int linearSearch(ArrayList<String> stringArray, String firstElement, String target){
		for(int i = 0; i < stringArray.size(); i++)
	    {
	        if (stringArray.get(i).equals(target)) 
	        {       
	            return i; 
	        }
	    }
	    return -1;
	}
	
	int binarySearch(Integer intArray[], Integer firstElement,  int l, int r, int target) { 
		intArray = bubbleSort(intArray, intArray[0]);
		int start = 0;
		int end = intArray.length - 1;	
		int position = -1;
		while (start <= end) {
			position = (int) ((end + start) / 2);
			if (intArray[position] > target) {
				end = position - 1;
			} else if (intArray[position] < target) {
				start = position + 1; 
			} else {
				return position;
			}
		}
		return -1;
    } 
	
	int binarySearch(String stringArray[], String firstElement,  int l, int r, String target) { 
		Collator myCollator = Collator.getInstance();
		stringArray = bubbleSort(stringArray, stringArray[0]);
		int start = 0;
		int end = stringArray.length - 1;	
		int position = -1;
		while (start <= end) {
			position = (int) ((end + start) / 2);
			if (myCollator.compare(stringArray[position], target) > 0) {
				end = position - 1;
			} else if (myCollator.compare(stringArray[position], target) < 0) {
				start = position + 1; 
			} else {
				return position;
			}
		}
		return -1;
    } 
	
	int binarySearch(ArrayList<Integer> intArray, Integer firstElement,  int l, int r, int target) { 
		intArray = bubbleSort(intArray, intArray.get(0));
		int start = 0;
		int end = intArray.size() - 1;	
		int position = -1;
		while (start <= end) {
			position = (int) ((end + start) / 2);
			if (intArray.get(position) > target) {
				end = position - 1;
			} else if (intArray.get(position) < target) {
				start = position + 1; 
			} else {
				return position;
			}
		}
		return -1;
    } 
	
	int binarySearch(ArrayList<String> stringArray, String firstElement,  int l, int r, String target) { 
		Collator myCollator = Collator.getInstance();
		stringArray = bubbleSort(stringArray, stringArray.get(0));
		int start = 0;
		int end = stringArray.size() - 1;	
		int position = -1;
		while (start <= end) {
			position = (int) ((end + start) / 2);
			if (myCollator.compare(stringArray.get(position), target) > 0) {
				end = position - 1;
			} else if (myCollator.compare(stringArray.get(position), target) < 0) {
				start = position + 1; 
			} else {
				return position;
			}
		}
		return -1;
    } 

}