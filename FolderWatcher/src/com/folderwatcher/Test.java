package com.folderwatcher;


public class Test
{
	
	public static void main(String[] args) {
	   
		 String listenedFolderPath;
		 listenedFolderPath="/Users/ttdduman/downLoads";
		 
		if (args.length > 0) {
			listenedFolderPath = args[0];
		}
		
		 new FolderWatcher(new FolderWatcherDelegate(){

			@Override
			public void created(String fileName) {

				System.out.println("File created:"+fileName);
			}

			@Override
			public void deleted(String fileName) {
				System.out.println("File deleted:"+fileName);
				
			}

			@Override
			public void modified(String fileName) {
				System.out.println("File modified:"+fileName);
			}	
			}, listenedFolderPath);
	}

}
