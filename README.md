# dansmultipro

How to log in:
1. Setup the database
2. make sure there are already user in the database with the password being signed with bcrypt
3. Hit the "/login" endpoint along with "username" and "password" as a parameter or x-www-form-urlencoded body
4. After receiving the access token, hit the other endpoint with authorization as header key and "Bearer {access_token}" as the value
