<?php
$con = mysql_connect("localhost","root","");
if(!$con)
{
die('Could not connect: ' . mysql_error());
}
$sel=mysql_select_db("project", $con);
 if (!$sel)
{
die('Could not select db: ' . mysql_error());
}
$sql="INSERT INTO registration (user,email,phone,address)VALUES('$_POST[user]','$_POST[email]','$_POST[phone]','$_POST[address]')";
$a=$_POST[user];
$b=$_POST[email];
$c=$_POST[phone];
$d=$_POST[address];
if (!mysql_query($sql,$con))
{
die('Error: ' . mysql_error());
}
echo '<script>alert("account created successfully");</script>';
mysql_close($con);
header("location:example.html");
?>