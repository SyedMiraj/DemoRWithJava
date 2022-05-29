Process to set the environment
------------------------------

1. Install package rJava using R install.packages("rJava")
2. Right-click on My Computer > Properties > Advanced System Settings > Environment Variables
3. Find Var PATH or CLASSPATH and Edit, add the following paths: C:\Program Files\R\R-3.4.0\bin\x64;
   C:\Users\ [User Name]\Documents\R\win-library\3.4\rJava\jri\x64
4. Go to C:\Program Files\R\R-3.4.0\bin\x64 and copy all .dll files (
   here they are: R.dll,Rblas.dll,Rgraphapp.dll,Riconv.dll,Rlapack.dll)
5. Past them at C:\Program Files\Java\jdk1.8.0_144\bin
6. When you create your java project, remeber to add the JRI.jar, JRIEngine.jar and Rengine.jar to your project build path. 
   They are located at C:\Users\ [User name]\Documents\R\win-library\3.4\rJava\jri
7. 