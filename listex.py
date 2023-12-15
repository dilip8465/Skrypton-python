list1 = ["","",""]
list2 = ["","",""]
list3 = ["","",""]
index_list = ["a","b","c"]
final_list = [list1,list2,list3]

user_input = input("where to?")
letter_index=index_list.index(user_input[0])
number_index=int(user_input[1])-1
final_list[letter_index][number_index]="something"
print(final_list)