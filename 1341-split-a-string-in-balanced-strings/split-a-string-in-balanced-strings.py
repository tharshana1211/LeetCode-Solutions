class Solution:
    def balancedStringSplit(self, s: str) -> int:
        cl=0
        cr=0
        c=0
        for i in s:
            if i=='L': 
                cl+=1
            elif i=='R':
                cr+=1
            if cl==cr:
                c+=1
                cl=0
                cr=0
        return c


        