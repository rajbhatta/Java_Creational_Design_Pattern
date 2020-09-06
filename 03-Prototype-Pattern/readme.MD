## Design consideration ##
- It avoids costly creation operation: 
- Avoid subclassing:  we create an instance of the actual prototype that we are trying to work with.
- Typically doesn't use new keyword: the first instance created might use keyword new after that it is cloned.
- Often utilize an interface
- Usually implemented with a registery.

Example:
java.lang.object#clone()

