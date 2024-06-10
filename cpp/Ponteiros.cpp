#include <string.h>

class Ponteiros {
public:
    char *Strcpy(char *s, char *t) {
        char *copia = s;
        while (*t != '\0') {
            *s = *t;
            s++;
            t++;
        }
        *s = '\0';
        return copia;
    }

    int Strcmp(char *s, char *t) {
        int compara;
        compara = strcmp(s, t);

        if (compara < 0) {
            return -1;
        } else if (compara > 0) {
            return 1;
        } else return 0;
    }
    void Strcat (char *s, char *t){
        char *result;
        while (*s != '\0') {
            *result = *s;
            result++;
            s++;
        }
        while (*t != '\0') {
            *result = *t;
            result++;
            t++;
        }
        *result = '\0';
    }
    int Strlen (char *s){
        int total=0;

        while( s[total] != '\0')
            total++;

        return total;
    }
};
