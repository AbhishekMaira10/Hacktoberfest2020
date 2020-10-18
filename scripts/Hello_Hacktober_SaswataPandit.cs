using System;
using System.Collections.Generic;
using System.Threading;

namespace HelloHacktober
{
    class Program
    {
    	public static void Main(string[] args)
        {
            // LANGUAGE: C#
            // AUTHOR: psaswata07
            // GITHUB: https://github.com/psaswata07
            
            string HelloHack = "Hello, Hacktober2020!";
        	foreach(char a in HelloHack){
                Console.Write(a); Thread.Sleep(100);
            }
        }
    }
}