class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t) : return False
        d={}
        for i in s:
            if i not in d :
                d[i]=0
            else : 
                d[i]+=1
        for i in t:
            if i not in d:
                return False
            else :
                if d[i]<0 : return False
                d[i]-=1
        return True