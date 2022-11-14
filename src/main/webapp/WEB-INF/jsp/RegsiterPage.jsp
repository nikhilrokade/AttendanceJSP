<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>LoginView</title>
</head>
<body>

<div style="text-align:center;">
    <h1>Attendance Application</h1>
</div>
<div style="float:right;">
</div>
<br>

<div class="container">
    <div style="text-align:center;">


        <h2>Login Page</h2>
        <form action="register" >


            <div class="form-group">
                <input Input placeholder="Enter Username" name="usename"[(Model)] ="username">
            </div>
            <br><br>


            <div class="form-group">
                <input Input placeholder="Enter password"  name="password" type="password" [(Model)]= "password">
            </div>
            <br><br>

            <div class="form-group">
              <input Input placeholder="Enter EmailId" name="emailid" type="emailid" [(Model)]= "emailid">
            </div>
            <br><br>

            <div class="form-group">
               <input Input placeholder="Enter Phone no." name="phonenumber" type="phonenumber" [(Model)]= "phonenumber">
            </div>
            <br><br>



            <button mat-raised-button color="primary" class="btn btn-warning" (click)="saveUser()">Login</button>
            <span *ngIf="show">
                    <button mat-button color="accent">Register</button></span>


        </form>
    </div>
</div><br><br>

</body>
</html>