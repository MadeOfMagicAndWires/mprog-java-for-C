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

/* 
 *
 * Define what a Person is:
 * Each person includes a 
 * char * name = a person's name,
 * and 
 * int     age = a person's age
*/

typedef struct Person
{
    String name;
    int     age;
}
Person;

/* useful abbreviation for "struct Person *" */
typedef struct Person* PersonPtr;

/*
 * Function to print a person's name and age to stdout
 * Requires an initialized Person* p as argument
 */
void talk(PersonPtr p);

/*
 * Makes a comment about a person's age if the person's age
 * if that person is of the age 5 or under.
 * Requires an initialized Person* p as argument
 */ 
void commentAboutAge(PersonPtr p);

/*
 * Function to initialize a Person to contain values
 * 
 * Takes the following arguments
 * char * aName = String of the name of the Person
 * int    anAge = int of the person's age
 *
 * Returns the Person*, pointing to an initialized Person
 */
PersonPtr make_person(String aName, int anAge);

//vim:set tabstop=2 shiftwidth=2 expandtab
