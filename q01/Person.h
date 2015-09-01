/******************************************************************************
 * Person.h
 *
 * Minor Programmeren
 * Joost Bremmer, 10113452
 *
 * Creates a "Person" struct containing a Person's name and age
 *
******************************************************************************/

#ifndef PERSON_H
#define PERSON_H
#endif


#include <stdio.h>
#include <stdint.h>

/* useful Java-like abbreviation for "char *" */
typedef char * String;

typedef struct Person
{
	String name;
	int     age;
}
Person;

/* useful abbreviation for "struct Person *" */
typedef struct Person* PersonPtr;


void talk(PersonPtr p);
void commentAboutAge(PersonPtr p);

void freePerson(PersonPtr p);


PersonPtr make_person(String aName, int anAge);

//vim: ts=2 sw=2 et
