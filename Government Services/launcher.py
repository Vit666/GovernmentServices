import os

JAVAC_SAVE_APPLICATION = ("javac -sourcepath ./src -d bin " + 
	"src/gov/allowance/childrenallowance/SaveNewApplication.java")

JAVAC_APPLICATION_VERIFICATION = ("javac -sourcepath ./src -d bin " + 
	"src/gov/allowance/childrenallowance/ApplicationVerification.java")

JAVA_SAVE_APPLICATION = ("java -classpath libs/postgresql-42.3.1.jar:./bin " + 
	"gov.allowance.childrenallowance.SaveNewApplication")

JAVA_APPLICATION_VERIFICATION = ("java -classpath libs/postgresql-42.3.1.jar:./bin " + 
	"gov.allowance.childrenallowance.ApplicationVerification")

PSQL_DEFINE = ("psql -h localhost -U snake -d statedatabase -a -f db/define.sql")

PSQL_MANIPULATE = ("psql -h localhost -U snake -d statedatabase -a -f db/manipulate.sql")

while True:

	command = input(">>> ");

	if command == "/e":
		break

	elif command == "/s": 
		os.system(JAVAC_SAVE_APPLICATION)

		args = input("arguments : ")

		if args != "":
			os.system(JAVA_SAVE_APPLICATION + " " + args)

		else:
			os.system(JAVA_SAVE_APPLICATION)
	

	elif command == "/v": 
		os.system(JAVAC_APPLICATION_VERIFICATION)

		args = input("arguments : ")

		if args != "":
			os.system(JAVA_APPLICATION_VERIFICATION + " " + args)

		else:
			os.system(JAVA_APPLICATION_VERIFICATION)
	

	elif command == "/d": 
		os.system(PSQL_DEFINE)


	elif command == "/m": 
		os.system(PSQL_MANIPULATE)


	elif command == "/h":
		print("Commands : \n" + 
			"/s - run SaveNewApplication\n" + 
			"/v - run ApplicationVerification\n" + 
			"/d - run define.sql\n" + 
			"/m - run manipulate.sql\n" + 
			"/c - clear")


	elif command == "/c":
		os.system("clear")


	else:
		print("Unknown command...")