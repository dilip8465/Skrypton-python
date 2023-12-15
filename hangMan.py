import random
def hangman():
      words_list=["skrypton","wipro","accenture","capgemini","mindtree","dxc","luxoft"]
      word=random.choice(words_list)
      attempts=8
      guesses=""
      print("please enter your name")
      player_name=input()
      print("hello {} !! welcome to the game".format(player_name))
      print("Instructions")
      print("we have a word and if you select all the letters in the word in a certain number of attempts yot WIN")
      print("{} have {} attempts".format(player_name,attempts))
      print("press 1 if you want to start the game otherwise press 0")
      ans=int(input())
      if(ans==1):
        while(attempts>0):
               failed = 0             
               for char in word:
                    if char in guesses:
                         print (char,end="")    
                    else:
                         print ("_",end="")
                         failed += 1
                         
               if (failed == 0):
                    print ("You won") 
                    break              
               guess = input("\nguess a character:") 
               guesses += guess                    
               if guess not in word:
                    attempts-= 1
                    print("Wrong input")
                    print("You have {} more guesses".format(attempts)) 
                    if attempts == 0:
                          print ("You Lose") 
hangman()