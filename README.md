# FolderWatcher
Simple folder event listening class. You can easily track and handle DELETE,CREATE and MODIFY events. 

Code Sample
```
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



