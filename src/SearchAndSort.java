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
				else if (option.toLowerCase().equals("merge")) { //TODO
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
													//System.out.println("Merge Sort: " + Arrays.toString(s.mergeSort(arrayInt, arrayInt[0])));
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
												//	System.out.println("Merge Sort: " + s.mergeSort(arrayInt, arrayInt.get(0)).toString());
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
														//System.out.println("Merge Sort: " + Arrays.toString(s.mergeSort(arrayString, arrayString[0])));
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
														//System.out.println("Merge Sort: " + s.mergeSort(arrayString, arrayString.get(0)).toString());
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
													//System.out.println("Linear Search: " + Arrays.toString(s.linearSearch(arrayInt, arrayInt[0])));
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
													//System.out.println("Linear Search: " + s.linearSearch(arrayInt, arrayInt.get(0)).toString());
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
														//System.out.println("Linear Search: " + Arrays.toString(s.linearSearch(arrayString, arrayString[0])));
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
														//System.out.println("Linear Search: " + s.linearSearch(arrayString, arrayString.get(0)).toString());
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
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
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
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
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
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
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
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j>=0 && myCollator.compare(stringArray.get(j), key) > 0) 
            { 
            	stringArray.set(j+1, stringArray.get(j)); 
                j = j-1; 
            } 
            stringArray.set(j+1, key); 
        } 
		return stringArray;
	}
	
	
	
	// there is a split function that lets you take comma separated things into an array
	// arraylist 
}