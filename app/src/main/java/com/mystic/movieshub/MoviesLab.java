package com.mystic.movieshub;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoviesLab {

    List<Movie> actionMovieList = new ArrayList<>();
    List<Movie> comedyMovieList = new ArrayList<>();
    List<Movie> dramaMovieList = new ArrayList<>();


    String[] actionmoviepposterurl = {
            "https://m.media-amazon.com/images/M/MV5BYjA5YjA2YjUtMGRlNi00ZTU4LThhZmMtNDc0OTg4ZWExZjI3XkEyXkFqcGdeQXVyNjUyNjI3NzU@._V1_UY268_CR16,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BMDY1NzhlZDAtYTM1Mi00NjU3LTk4MWQtZDgxZGQxYzhmZTNhXkEyXkFqcGdeQXVyNzIzMTc2Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BNDJiZDliZDAtMjc5Yy00MzVhLThkY2MtNDYwNTQ2ZTM5MDcxXkEyXkFqcGdeQXVyMDA4NzMyOA@@._V1_UX182_CR0,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BMDJiNzUwYzEtNmQ2Yy00NWE4LWEwNzctM2M0MjE0OGUxZTA3XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX182_CR0,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BMjkxNDQxZWYtZTBjOS00YjQ5LTk4ODgtMGFkODMyYTI2NTljXkEyXkFqcGdeQXVyODUwMjI3MzU@._V1_UX182_CR0,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BN2M5MzE4NTMtMDNmOC00ZDQyLTkwYjUtZWY5ZDQ1MjYwNDZiXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UY268_CR4,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BMzQ3NTQxMjItODBjYi00YzUzLWE1NzQtZTBlY2Y2NjZlNzkyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BMmIzYzUyZTktODVlYy00ZTdjLWFkYzEtNTMyZTY3MWVhNzQ0XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UY268_CR4,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BMWU0MGYwZWQtMzcwYS00NWVhLTlkZTAtYWVjOTYwZTBhZTBiXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BNDliY2E1MjUtNzZkOS00MzJlLTgyOGEtZDg4MTI1NzZkMTBhXkEyXkFqcGdeQXVyNjMwMzc3MjE@._V1_UX182_CR0,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BZGVhZDBlZjgtMGNmNi00OTIyLWI1NzQtMzE5ZWQ0NzFmMjg0XkEyXkFqcGdeQXVyMTA2OTQ3MTUy._V1_UX182_CR0,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BMzFiODE0ZDUtN2IxNC00OTI5LTg4OWItZTE2MjU4ZTk2NjM5XkEyXkFqcGdeQXVyNDYzODU1ODM@._V1_UX182_CR0,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BYmQ3MTY4NDUtOWExZi00OGQxLTgzNmQtODI1MTFkZjMyMDY0XkEyXkFqcGdeQXVyODk2NDQ3MTA@._V1_UX182_CR0,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BOTYzMTlhM2ItMmFkYi00ZTJhLTg3MWQtNzM1NTRkM2NiNzRjXkEyXkFqcGdeQXVyNTE1NjY5Mg@@._V1_UY268_CR8,0,182,268_AL_.jpg",
    "https://m.media-amazon.com/images/M/MV5BNTEyYTA5YWYtYmIxYS00NWRlLWExNjMtNjliZmVlZDgxNTBlXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_UX182_CR0,0,182,268_AL_.jpg"};

    String[] comedyMoviesPoster ={
            "https://m.media-amazon.com/images/M/MV5BMTlkMmVmYjktYTc2NC00ZGZjLWEyOWUtMjc2MDMwMjQwOTA5XkEyXkFqcGdeQXVyNTI4MzE4MDU@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjZjNzRjNmQtOGJlMS00NzVkLWFmYWQtYjIxMzJmYTkwMjhhXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYzkxMzMzOTgtNmZhMS00MGM0LTk3MzUtMjE1MzI4MzU5ZjkzXkEyXkFqcGdeQXVyMDA4NzMyOA@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNmRkZmZiNzUtMzgwYy00NTEzLWE2NjctMmI3NGI5ZTBiNDdkXkEyXkFqcGdeQXVyNzE3ODQxNjU@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMThkYWYwMzQtZTUxMi00YTJmLWFiOTItNTAxMWY5ZjE4MmMxXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BOGRiODEzM2QtOTUyYi00MWRlLTg4MzMtZGI0YmUzNWUyMjQ0XkEyXkFqcGdeQXVyMDA4NzMyOA@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNzU3ZTI1OTktNjVkNy00OWEzLWIyNzAtMWQ5YjRkZDU1ZjAxXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZDczYjkxYzMtMGM2Yy00MDg0LWIwZGQtMjYwZWEzNDFmMzY5XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYTlkNWRjMDMtYmVlYS00NTlkLWI5OTUtZWY1YmZmNTNkZGFjXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZTg3NWFkN2ItOTdjMi00NDk4LTllMDktNGZiNTUxYmZmMjlmXkEyXkFqcGdeQXVyMjM4NTM5NDY@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNzU1ZTE4YzAtOWNkYi00YWE4LThmY2YtMDNlYzU2ZTgxYTc2XkEyXkFqcGdeQXVyODQzNTE3ODc@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjdhZmUxZTMtOWRmZS00ZmY0LTgxMzMtZjRjZDg2MTExY2IyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BODIwMmQxNDktOWZjZC00NWI4LTg1NjktMGViOTE4ZTA4ZGY5XkEyXkFqcGdeQXVyNjg5MjU3NjE@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BOTIzYmUyMmEtMWQzNC00YzExLTk3MzYtZTUzYjMyMmRiYzIwXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_UY268_CR1,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZDQ2NTdmNDgtMGIwMS00ODE2LTk5M2EtZGZhYzc4MWRlNTU3XkEyXkFqcGdeQXVyNTc4MjczMTM@._V1_UX182_CR0,0,182,268_AL_.jpg"
    };


    String[] dramaMoviesPoster ={
            "https://m.media-amazon.com/images/M/MV5BNzE4ZDEzOGUtYWFjNC00ODczLTljOGQtZGNjNzhjNjdjNjgzXkEyXkFqcGdeQXVyNzE5ODMwNzI@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZjQ1YTM4M2UtMTQxNS00YjdjLTgwZGYtZTgzYmFiYjFkYzNlXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjBkMDZkNjctNmZhNi00Mzc5LTk0OTctNzFlMDExYzM3ZDNhXkEyXkFqcGdeQXVyNDY2MjcyOTQ@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjI4MjM1NTctMmQwYy00ZDE3LTllOTAtODRlNjJkMTg1MDAwXkEyXkFqcGdeQXVyMDA4NzMyOA@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZDcxZDU1NWEtMDU4NC00ZTJmLWE1NWUtM2Y2ZjEyZjliZTUzXkEyXkFqcGdeQXVyMjI3NDAyNg@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BODhlYTYzM2MtMGM5ZC00MjRlLWI5NTYtMDNmZGE0ZTAyNWVmXkEyXkFqcGdeQXVyMjI3NDAyNg@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BOGUzZjZhMmUtZDE4Yi00NTI0LWJlMDUtNTU1OWI2ZWM1MzBmXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMGUzMGEzM2UtMDg2Ny00Yjk1LTgxMTctMWI1ZGM0ZDBiYjgxXkEyXkFqcGdeQXVyMTA4NjE0NjEy._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYjBjMTgyYzktN2U0Mi00YTJhLThkZDQtZmM1ZDlmNWMwZDQ3XkEyXkFqcGdeQXVyMDU5MDEyMA@@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYmUxYzAxMTgtNzhjNC00YjI1LTlmMTItOGU0ZmZjZmQ5NmVlXkEyXkFqcGdeQXVyODY3Nzc0OTk@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMWNkOWNlNmEtYmRhZC00ZGRjLWIwZjgtMTJiNDhhNTg2YjkzXkEyXkFqcGdeQXVyMTY5Nzc4MDY@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYmM3MDlkNDItN2RhNy00Mjc2LWJmNjktODk4NGE0NmRmMTFkXkEyXkFqcGdeQXVyODE0OTU5Nzg@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYjc1N2M1YjMtYzBiNi00NGFiLThkN2QtY2EwZGU5MDRkODAzXkEyXkFqcGdeQXVyMTkzODUwNzk@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNWU2NzEyMDYtM2MyOS00OGM3LWFkNzAtMzRiNzE2ZjU5ZTljXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYTNjNzFiZTItNDM5NS00ODBhLTk5NmMtYzUyZWRmOWJjOTI3XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_UX182_CR0,0,182,268_AL_.jpg"
    };


    Movie[] actionMovies = {
            new Movie("Bloodshot",4,2020,"With F9, the next chapter in the NOS-powered Fast and Furious saga, pushed to 2021 because of the outbreak" +
                    " of the coronavirus, Vin Diesel fans will have to make due with Bloodshot, a frenzied adaptation of a popular Valiant Comics title first published in the '90s." +
                    " Like many non-Fast thrillers from Diesel, the results are a mixed bag, emphasizing the star's muscular frame","https://assets3.thrillist.com/v1/image/2887945/1584x1056/crop;jpeg_quality=60;progressive.jpg"),
            new Movie("Debt Collectors",3,2020,"A sequel to 2018's Walter Hill-like throwback The Debt Collector, which found the reliably bruising Scott Adkins playing a reluctant mob " +
                    "bagman named French, this buddy action comedy occasionally fails to pay up","https://assets3.thrillist.com/v1/image/2895301/1584x1054/crop;jpeg_quality=60.jpg"),
            new Movie("The Old Guard",4,2020,"After battling her way through an apocalyptic desert wasteland in Mad Max: Fury Road, punching her way" +
                    " through Berlin in Atomic Blonde, and tangling in the sky with the Fast and Furious crew, Charlize Theron gets her own superhero franchise with this curious " +
                    "adaptation of Greg Rucka's comic series focussed on a rag-tag group un-killable mercenaries. ","https://assets3.thrillist.com/v1/image/2887944/1584x1054/crop;jpeg_quality=60.jpg"),
            new Movie("Extraction",5,2020,"Tossing aside Thor's massive hammer and trimming his gnarly Avengers: Endgame beard, Chris Hemsworth picks up " +
                    "an assault rifle and gets to work in Extraction, a new Netflix shoot-em-up that re-teams the Australian actor with his former Marvel filmmaking buddies " +
                    "Joe and Anthony Russo,","https://assets3.thrillist.com/v1/image/2869863/1584x1054/crop;jpeg_quality=60.jpg"),
            new Movie("Blood on Her Name",4,2020,"At less than 90 minutes, this dread-soaked, Southern-fried neo-noir doesn't waste time turning the screws on" +
                    " its put-upon protagonist. Leigh (Bethany Anne Lind) is introduced having recently survived an attack and possibly killed a man lying dead on the floor" +
                    " of her garage. She knows exactly what happened; the viewer is kept in the dar","https://assets3.thrillist.com/v1/image/2865018/1584x3000/scale;jpeg_quality=60.jpg"),
            new Movie("Lost Bullet",5,2020,"Alban Lenoir, the star and co-writer of this proudly sturdy French thriller, has a rugged-yet-droll Statham-like quality," +
                    " that rogue-like charisma that never reads as desperation. He plays Lino, a hapless thief who turns into an unlikely car mechanic for the police," +
                    " and he spends most of the movie attempting to clear his name for a murder he didn't commit. ","https://assets3.thrillist.com/v1/image/2895303/1584x1054/crop;jpeg_quality=60.jpg"),
            new Movie(" Birds of Prey",3,2020,"Birds of Prey, the recently retitledSuicide Squad spin-off starring  Margot Robbie's joyfully defiant Harley Quinn, " +
                    "didn't exactly light up the box office in the same way last year's Oscar-nominated Joker movie did, but it's a lot more fun.",
                    "https://assets3.thrillist.com/v1/image/2865021/1584x3000/scale;jpeg_quality=60.jpg"),
            new Movie("Time to hunt",5,2020,"Unrelenting in its pursuit of scenarios where guys point big guns at each other in sparsely lit empty hallways, Time " +
                    "to Hunt is a South Korean thriller that knows exactly what stylistic register it's playing in. A group of four friends, including Parasite and Train" +
                    " to Busan break-out Choi Woo-shik, knock over a gambling house,","https://assets3.thrillist.com/v1/image/2876429/1584x3000/scale;jpeg_quality=60.jpg"),
            new Movie("Bad boys of Life",5,2020,"In what hasn't exactly been a great year for action movies so far, Bad Boys for Life has to be the biggest surprise." +
                    " Given its lengthy production history, its January release date, and the departure of series director Michael Bay -- the action auteur gets a winking cameo here, " +
                    "perhaps taking a break from shooting Netflix's 6 Underground -- this movie could've been a disaster","https://assets3.thrillist.com/v1/image/2864985/1584x3000/scale;jpeg_quality=60.jpg"),
            new Movie("Mulan",5,2020,"The latest installment in Disney’s never-ending list of live-action remakes of animated classics was " +
                    "scheduled to hit theaters on March 27, but it was postponed until late July due to the coronavirus pandemic—but it looks like it'll be worth the wait. While this" +
                    " version doesn't have a talking dragon sidekick or multiple song-and dance-breaks, Mulan appears to be even more of a badass now than she was in 1998.",
                    "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*"),
            new Movie("Wonder Woman 1984",4,2017,"After the (much-deserved) massive success of 2017’s Wonder Woman, it makes sense that " +
                    "director Patty Jenkins and star Gal Gadot would dive immediately back into the sequel. It’ll be out later this summer, with Wonder Woman going head-to-head with " +
                    "Kristen Wiig’s villainous Cheetah. Though it looked like Chris Pine’s role as Steve Trevor came to an end at the close of the first film, he does make an appearance" +
                    " in the sequel’s trailer, and that, combined with the fact that superhero movies play by no one’s rules, means anything could happen come August 14.","https://m.media-amazon.com/images/M/MV5BMjZhYWZlNjgtMTgxYi00ODQ0LTlkYTQtOTM2Mzk0OTM3YzFlXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UY99_CR39,0,99,99_AL_.jpg"),
            new Movie("Black Widow",3,2018,"Since Scarlett Johansson’s Black Widow, a.k.a. Natasha Romanoff, first entered the Marvel Universe" +
                    " in Iron Man 2, the world has been holding its breath for a standalone movie. Those dreams will finally come true this year, as Black Widow is backed by her family–played b" +
                    "y Florence Pugh, Rachel Weisz, and David Harbour–on a mission to settle some unfinished business buried deep in her past.","https://m.media-amazon.com/images/M/MV5BZjVlYTRiNzAtNmRmNy00Mjk0LThhODYtYzMyNDk0OWQzMjBkXkEyXkFqcGdeQXVyNjczOTE0MzM@._V1_UY99_CR39,0,99,99_AL_.jpg"),

            new Movie("No Time to Die",5,2019,"James Bond has a bit of a sexism problem, but the 25th installment in the British spy series " +
                    "already looks to be miles ahead of its predecessors due to the fact that it was co-written by Killing Eve creator Phoebe Waller-Bridge and features a theme song performed " +
                    "by Billie Eilish. We can’t wait to see 007 go full Fleabag–but who will play his Hot Priest?!","https://m.media-amazon.com/images/M/MV5BMWZjY2Y4Y2MtNTdjZC00ZTczLTg2MmUtZGJkMzYxMGQ1NTdhXkEyXkFqcGdeQXVyMzE1NDkwMDA@._V1_UX99_CR0,0,99,99_AL_.jpg"),
            new Movie("The Eternals",5,2020,"Just when you thought Marvel couldn’t find any more huge stars to join its cinematic universe... " +
                    "That’s right, Angelina Jolie and Salma Hayek are now Avengers-adjacent, as are half the Stark children and, of course, #RippedKumailNanjiani. Almost all of them will play " +
                    "members of the titular alien race, who are working together to protect Earth from the Deviants, sworn enemies of the Eternals. Welcome to the next phase of the Marvel un" +
                    "iverse.","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/67334917-10157314311827488-1938253040570073088-o-0-1585754443.jpg?resize=768:*"),
            new Movie("Top Gun: Maverick",4,2020,"Apparently, there’s no such thing as “too long” to wait between franchise installments" +
                    ". Thirty-four years after the original Top Gun, Tom Cruise will reprise his role as Navy aviator Maverick. According to the official plot synopsis, he’ll be confronting" +
                    " ghosts from his past while leading a team of pilot trainees on a highly dangerous mission–should they choose to accept it. (Oops, wrong Tom Cruise franchise.)","https://m.media-amazon.com/images/M/MV5BZDNmMWU1NjctZDBlZC00MDIwLWI0NmUtY2VkNWZkM2I2YWUzXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_UY99_CR24,0,99,99_AL_.jpg"),
    };

    Movie[] comedymovies = {

            new Movie("The Gentleman",4,2020,"Humor is such a subjective thing. It's easy to be ridiculous, or worse—boring. " +
            "But 2020 boasts a number of films that look like they're destined to be comedic gold, or at least a great time at the theater (or in your living room). " +
            "There are a couple reboots and sequels in here, plus " +
            "a number of comedic superstars are back in a big way, thanks to Ghostbusters: Afterlife, Coming 2 America, and a few other revivals we have our eye on. " +
            "(You can check out our 2019 list of the best comedy movies here.)",
            "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/the-personal-history-of-david-copperfield-ztphdc-001-rgb-1-1598280580.jpg?crop=0.597xw:0.895xh;0.219xw,0.105xh&resize=980:*"),

            new Movie("Yes, God, Yes",5,2019,"For anyone who had a very religious upbringing, this dramedy may be hilariously" +
            " familiar. Teenager Alice (Dyer), growing up in the '00s, is stuck between the abstinence-only sex education she gets at school and the (super-normal) " +
            "impulses she has as a teenager watching Titanic and sneaking onto AOL chatrooms. The film's not exactly a satire, but it does have some smart things to " +
            "say about the hypocrisy of religious sex-ed as well as the harms of slut-shaming (poor Alice is falsely accused of performing sexual acts she's never " +
            "even heard of). Even if you're less familiar with the subject matter, come for the sweet, awkward sexual awakening story.","https://pyxis.nymag.com/v1/imgs/643/974/18631087e962f91ec73181e057219a8e0c-sea-fever.rhorizontal.w700.jpg"),

            new Movie("The King of Staten Island",4,2020,"An alternative history of what would have happened to Pete Davidson if " +
            "he hadn't become an SNL star, it's a typical Judd Apatow \"lovable loser\" setup. Davidson's playing a lamer, but still funny version of himself, and digs " +
            "surprisingly deep as his character has to " +
            "face the trauma of his firefighter father's death (based partially on Davidson's real life). But the supporting cast is the real joy. Burr and Buscemi in" +
            " particular are delightfully believable firefighters who become quasi-father figures; It's not as corny as it sounds, but it's got that trademark Apatow sweetness to make this an easy viewing.","https://pyxis.nymag.com/v1/imgs/16a/a64/40cb5a8974b941250852a5333fcadbc355-selah-and-the-spades.rhorizontal.w700.jpg"),

            new Movie("An American Pickle",5,2020,"Rogen perfectly plays two roles here: He's both Herschel, the 1919 Jewish factory worker who wakes up" +
            " 100 years later after getting brined in a pickle vat (it's as weird as it sounds, but just go with it) and his ancestor, app developer Ben. What follows is a fish out of water " +
            "tale with a twist—the film skewers everything from Twitter and hipsters to Hershel's century-old ignorance and callousness. It can be a bit inconsistent (the film tries to shift " +
            "between barbed and wholesome, and the comedy sometimes comes off as too broad), but it has enough to say that it's salty-sweet where it counts.","https://pyxis.nymag.com/v1/imgs/8f2/ef7/033590384d179d00cda79d6d4c01a4d19f-bad-education.rhorizontal.w700.jpg"),

            new Movie("I Used to Go Here",5,2020,"This one hits hilariously—and sometimes painfully—close to home for me. Kate wrote a book! And the cover (and sales)" +
            " are terrible. She's an author! But her fiancé dumped her, and her book tour got cancelled. She gets invited to do a book reading by her old professor—Clement, perfectly playing that professor " +
            "who's just on the wrong side of creepy. Then she just kind of...sticks around on campus, unsure where to go from here and hanging out with a bunch of current students. It's a sweet and honest " +
            "look at the stresses and pains of being a 30-something (and a creative professional) who just doesn't feel like she can face the world ahead. It's also a pretty relevant quarantine watch, TBH.","https://pyxis.nymag.com/v1/imgs/17e/4fd/d075f49325b779620c215300ad19001be5-bull-.rhorizontal.w700.jpg"),

            new Movie("Emma",4,2020,"This will be a controversial statement among my fellow MC editors, but Emma is my favorite Jane Austen book (I know!!). It's so snarky " +
            "and has a deliriously happy ending without letting its fallible heroine off the hook for her (often-terrible) behavior. Beyond the effervescent Anya Taylor-Joy, consider at how many incredible actors " +
            "are in this. Bill Nighy? Funny in everything! Josh O'Connor? Yes, that guy from The Crown! Miranda Hart? The best part of Spy! And it all came together brilliantly—I think my favorite part might have been " +
            "Johnny Flynn as a very sexy Mr. Knightley. If you're looking for light and fluffy, this is the perfect pick.","https://pyxis.nymag.com/v1/imgs/612/c10/2a5b9a81d5f4045fc85b08126370337d22-0423-critics-ourmothers.rhorizontal.w700.jpg"),

            new Movie("Guns Akimbo",5,2020,"Post-Harry Potter, Radcliffe has done some weird and wacky stuff (and even when it doesn't work, I always appreciate the risk-taking)." +
            " This feels like one of the ones that actually works. Right now on Rotten Tomatoes it's juuuust on the side of fresh in terms of positive reviews. All-around loser Miles gets forced into a gladiator fight to " +
            "the death—guns are literally stapled to his hands. He has to team up with Nix (utter badass Weaving, who totally nailed it in Ready or Not) to save his girlfriend, the day, etc. Into it.","https://pyxis.nymag.com/v1/imgs/33f/390/6edd958eb00811ad57c1e5b7ac46afd517-the-half-of-it.rhorizontal.w700.jpg"),

            new Movie("The Climb",3,2019,"Kyle and Mike are two best friends who share a tight bond...right up until Mike sleeps with Kyle's fiancée. What comes next is a story of " +
            "friendship, frustration, and love, packed alongside jokes funny that are relatable enough to make you feel like you know the characters in your real life. It's not often we see movies focused on male friendships, " +
            "so The Climb is a breath of fresh air, in some cases quite literally.","https://pyxis.nymag.com/v1/imgs/2a8/f65/8c9b9568e38148a7cfb162208dc206b700-the-painter-and-the-thief.rhorizontal.w700.jpg"),

            new Movie("Banana Split",3,2018,"Ugh, this looks so cute. April (Marks) gets dumped by her high school boyfriend (Sprouse, playing against type with a long and terrible haircut)," +
            " only to fall in platonic love with his new girlfriend (Liberato). Think of it like Booksmart, but more of a love triangle. It includes badass music, witty banter, and killer supporting characters. It's not regular " +
            "teen angst, it's cool teen angst. You should watch.","https://pyxis.nymag.com/v1/imgs/097/75f/c6a06e2e3960c3d7b5b8d4ef85e440b0c6-the-trip-to-greece.rhorizontal.w700.jpg"),

            new Movie("Uncorked",4,2019,"Part drama, part comedy (I also included this on my best drama movies list, don't @ me), this is a sweet story about following your dreams. Oh, and it just " +
            "so happens to have some of the funniest banter in a film this year. What happens when you work at your dad's restaurant (Vance has never been better) but you want to become a sommelier? Athie is exceptional, hilarious, and " +
            "irritated at having to explain what a sommelier is, and he is quietly determined. There isn't a wrong note in the whole thing.","https://pyxis.nymag.com/v1/imgs/a45/3a3/432616de261b752bdfe43f784dc1168cd6-ya-no-estoy-squi-im-no-longer-here.rhorizontal.w700.jpg"),

            new Movie("The Lovebirds",5,2020,"Everyone's favorites, Issa Rae and Kumail Nanjiani, play a couple who find themselves caught up in a crime unexpectedly. As the two of them try to " +
            "solve the case to clear their name, they get into predictably wacky, terrible situations. TBH, the fact that these two are costars and singularly funny all on their own means this is worth the watch. Critics were a bit " +
            "divided, but pretty much everyone can agree its two stars were the best part. Count me in.","https://pyxis.nymag.com/v1/imgs/4ff/dc6/e7eabfca6c5acb30cd2837cc99359287a9-driveways.rhorizontal.w700.jpg"),

            new Movie("The Personal History of David Copperfield",3,2017,"I love seeing Dev Patel on any screen so, seeing him in The Personal History of David Copperfield—based on Charles Dickens'" +
            "s most famous novel—will be my Christmas, birthday, and half-birthday present wrapped up all in one. Much like the book it's modeled after, the movie will follow the life of David Copperfield as he sets out to become a writer," +
            " and promises to be as sharp-tongued as ever. Stay for the supporting cast, who are having so much fun that you're having fun just by being in the same room together. This has been delayed several times (but did premiere in the " +
            "UK to some pretty incredible reviews) so this will be the best late summer present I needed.","https://pyxis.nymag.com/v1/imgs/171/c6b/a02ecc1b76190aed2e8b1606e52007669c-ghost-of-peter-seller.rhorizontal.w700.jpg"),

            new Movie("The SpongeBob Movie: Sponge on the Run",4,2020,"I love SpongeBob, and not just for the GIFs. The show and its sweet characters are an indelible part of my teen years (I maintain " +
            "that you can still totally find it funny as an adult). The SpongeBob Movie: Sponge Out of Water was both critically loved and a box office hit, so the chances of a third movie were always good. I mean, Keanu Reeves, Awkwafina, " +
            "and Snoop Dog will be in this. How can you not love it?","https://pyxis.nymag.com/v1/imgs/c6e/f39/e5fb0e74ad5c3a7cccd2b93a1434ea634b-miss-juneteenth.rhorizontal.w700.jpg"),

            new Movie("Fast & Furious 9",5,2020,"Also known as F9, the follow-up to 2017’s The Fate of the Furious picks up with Vin Diesel’s character, Dominic Toretto, who is now in semi-retirement on" +
            " a farm and has a kid named after the late Paul Walker’s character. Charlize Theron and John Cena also star in the ninth movie of the franchise.","https://m.media-amazon.com/images/M/MV5BZWQ3ZmQ5OTAtMGYyOS00NTA0LThlMGItZDU3NTBlMWZjYzYwXkEyXkFqcGdeQXVyOTkwMTc4ODQ@._V1_UX99_CR0,0,99,99_AL_.jpg"),

            new Movie("The New Mutants",3,2020,"Maisie Williams stars as Rahne Sinclair/Wolfsbane, one of several teen mutants who are just discovering their powers while being " +
            "hidden at a secret facility.","https://m.media-amazon.com/images/M/MV5BYzEzYWQyMTktN2ZjNi00ZTgyLWJlODItZjc3ZGYzOGM4NTM2XkEyXkFqcGdeQXVyNTYwNjM1MTQ@._V1_UY99_CR43,0,99,99_AL_.jpg"),

    };


    Movie[] dramaMovies = {
            new Movie("Weathering With You",3,2020,"Anime’s king of feels Makoto Shinkai conquered the world in 2016 with his body-swap romance Your Name, a massive global hit that’s (of course) set for" +
            "an American remake. So it’s not a surprise that he’s stayed in similar teen-fantasy-romance territory for his follow-up, about a young runaway to Tokyo and the orphaned girl he falls in love with — a girl with the power " +
            "to bring the sun out, however briefly. What is surprising is the moodiness of Weathering With You, a love story for an era of climate change that staunchly refuses the idea that the young have to sacrifice themselves on " +
            "the altar of the decisions of previous generations. It’s darker and less deliriously swoony than Your Name, but its emotions are just as big — big enough to change the course of the future.",
                    "https://pyxis.nymag.com/v1/imgs/a35/319/573770d8b3de5c8392b9246a7d4eb9c141-15-weathering-with-you-2.rhorizontal.w700.jpg"),

            new Movie("Color Out of Space",4,2018,"Look, all you really need to know about this trippy H.P. Lovecraft update is that Nicolas Cage stars as a husband, father, and would-be farmer" +
            " who owns and does a lot of shouting about alpacas. Or maybe what’s most important is that this throwback horror freak-out is the work of filmmaker Richard Stanley, making a long-in-the-works comeback over two decades" +
            " after he was famously fired from the disaster that was The Island of Dr. Moreau. Either way, rest assured that things start going very poorly for the ill-fated family at its center, not to mention their animals, when " +
            "a meteor crash-lands on their rural property and starts warping reality around it.",
            "https://pyxis.nymag.com/v1/imgs/053/73c/dda7e5796b67c5e312fc5b85aa0b367dd9-color-out-of-space.rhorizontal.w700.jpg"),

            new Movie("The Assistant",5,2019,"Director Kitty Green’s scripted debut depicts a long day in the life of a low-level drone at an unnamed New York film studio not unlike the Weinstein Company." +
            " Jane (Julia Garner) takes calls and makes copy and scrubs the bodily fluids off the couch in her boss’ office, all with the same look of grim understanding that this is what she has to endure to get ahead in her dream industry. " +
            "Spare and devastating, The Assistant serves up a portrait of an abusive workplace in which the behavior of the unseen man at its head trickles down to inform the power dynamics and behavior of the rest of the company." +
            " That includes HR, to which Jane pays a visit in a brutal centerpiece scene that emphasizes what it’s like when the only choices open seem to be to become complicit or to give up.",
           "https://pyxis.nymag.com/v1/imgs/7c3/4af/68e90dd61b563b6611a8a06416d3f20757-05-the-assistant.rhorizontal.w700.jpg"),

            new Movie("The Whistlers",5,2020,"Romanian director Corneliu Porumboiu loves to play with procedure and form; he’s an ideal director for playful tales about bureaucrats, cops, and " +
            "other officials in a country still wrestling with the decades-long fallout from a communist dictatorship. His movies are cosmic comedies shot through with moments of ironic tragedy, and this crime comedy-drama might" +
            " be his weirdest one yet. It starts off as a bizarro tale about a policeman who has to learn a “whistling” language used by the inhabitants of one of the Canary Islands in order to help free a gangster from prison, " +
            "then twists into a moving meditation on love, loyalty, and self-improvement. Best experienced without knowing anything beforehand; I’ve already said too much!",
             "https://pyxis.nymag.com/v1/imgs/611/ec2/21d4ae85681a205283e4f1f3ba53b09d7c-03-the-whistlers.rhorizontal.w700.jpg"),

            new Movie("Beanpole",4,2020,"Russian director Kantemir Balagov’s soul-crushingly powerful and exquisitely mounted historical drama (which really deserved at least an Oscar nomination" +
            " this year; it was short-listed but didn’t make the final five) follows two female veterans trying to reconnect with life in postwar St. Petersburg. It starts off in unspeakable tragedy — the young director is known for" +
            " booby-trapping his films with the occasionally devastating image or plot development — which makes for a striking emotional and structural gambit. As the characters wrestle with their own trauma, we, too, are dealing " +
            "with the consequences of what we’ve seen. What makes it all work — and work so beautifully — is Balagov’s almost supernatural command of film language: the elegance of his storytelling, the vivid, symbolic use of color," +
            " the humanism of the performances. You can bask in Beanpole’s cinematic delights while simultaneously having your heart ripped to shreds.",
            "https://pyxis.nymag.com/v1/imgs/4f1/1bc/9c0b8518023db8f8ff3a3eb98d7397605a-10-beanpole.rhorizontal.w700.jpg"),

            new Movie("Sorry We Missed You",4,2020,"We wish we could have been a fly on the wall when Ken Loach — Britain’s foremost cinematic chronicler of working-class angst and quotidian humanism" +
            " — first learned about the gig economy. The concept fits right in with the veteran director’s moral vision of a world in which ordinary humans regularly think they can outsmart a system designed to destroy them." +
            " In this infuriating, heartbreaking drama, a middle-aged former builder starts driving a truck making e-commerce deliveries and discovers that his dream of being his own boss is the cruelest of illusions. Meanwhile, his wife," +
            " a home health-aide worker, struggles with her own corner of a so-called growth industry. What makes this one of Loach’s best isn’t just its rage (which is plentiful) but its compassion (which is overwhelming)." +
            "It offers a touching cross section of humanity, in which everybody is caught inside a giant machine that discards the weak, feeds on the strong, and perpetuates itself.",
            "https://pyxis.nymag.com/v1/imgs/65e/cb6/4c5f4d108fa1d7f5b04e15a5ce49364b27-04-sorry-we-missed-you.rhorizontal.w700.jpg"),

            new Movie("Never Rarely Sometimes Always",4,2020,"Exhilaratingly political but unfailingly intimate, Eliza Hittman’s third film is a thriller whose antagonist isn’t a person, but a society " +
            "bent on treating the bodies of the main characters as common property. Never Rarely Sometimes Always takes place over the course of a few days in which a pregnant teenager travels with her cousin to New York City to obtain " +
            "the abortion that restrictions have made unavailable to her in their home state of Pennsylvania. The precariousness of their situation, which soon stretches beyond the capacity of their meager resources, is counterbalanced" +
            " by the strength of their bond. Newcomers Sidney Flanigan and Talia Ryder aren’t just magnetic — they convey, often without words, what it means to have someone to really rely on.",
            "https://pyxis.nymag.com/v1/imgs/344/1fd/9663a5f141ecc78b2b6dba1b60c32f16cd-sundance-never-maybe-sometimes-always-1.rhorizontal.w700.jpg"),

            new Movie("First Cow",4,2019,"The rhythms of Kelly Reichardt’s hardscrabble 19th-century Pacific Northwest frontier drama are idiosyncratic if not inscrutable, which is why you’re unprepared" +
            " for sudden revelations or flashes of connection. Her focus (after some throat-clearing) is the bond between two criminally endearing men: a mild-mannered baker (John Magaro) and an enterprising Chinese immigrant (Orion Lee), " +
            "who hatches a plan to squeeze milk every night from the region’s lone bovine (owned by the county’s wealthiest man). The doughnuts they fry up make them gobs of money while leaving them open to mob justice, and you’re torn " +
            "between elation (take that, rich ass!) and dread. It opens with a line from Blake: “The bird, a nest, the spider, a web, man friendship” — an assertion that home isn’t a place or thing but a connection to someone not you." +
            " This haunting movie transports you to another world — and redefines home.","https://pyxis.nymag.com/v1/imgs/2f7/e46/acaa417fb2b1db6ace3b3bb90f7618acca-6-first-cow.rhorizontal.w700.jpg"),

            new Movie("The Way Back",5,2016,"Ben Affleck gets one of his greatest (and most personally resonant) roles as an alcoholic former high-school basketball star who gets a chance at " +
            "redemption when he’s hired to coach his alma mater’s hopeless hoops team. This could easily become mired in clichés, but director Gavin O’Connor and writer Brad Ingelsby strike a fine balance between delivering the " +
            "promised underdog sports drama and presenting a portrait of trauma and grief that resists easy solutions. At the center of it all is the star’s tense, restrained performance as an emotionally distant man whose considerable" +
            " demons can’t really be vanquished with a few wins.","https://pyxis.nymag.com/v1/imgs/6ee/bb0/a0ead6e696303efdbcc414ff4bc78b8b6b-03-the-way-back.rhorizontal.w700.jpg"),

            new Movie("Swallow",4,2018,"Haley Bennett is absurdly good as a Hudson Valley housewife who’s sleepwalking through a controlling marriage until a psychological disorder forces her into awareness." +
            " Carlo Mirabella-Davis’s psychological drama is an exploration of domestic oppression and unexamined expectations of motherhood — but it’s also its own kind of body-horror story, as its heroine finds herself indulging in the urge " +
            "to swallow things that were never intended for human consumption. These increasingly disturbing spectacles are enfolded in a movie that’s otherwise mesmerizingly beautiful, like a dream that gives way to a nightmare before dumping " +
            "you, abruptly, back into the land of the living.","https://pyxis.nymag.com/v1/imgs/960/249/4fc1a77084176eda4f3553ae5ca8eba779-17-swallow-2.rhorizontal.w700.jpg"),

            new Movie("Lost Girls",3,2018,"Liz Garbus’s grim Netflix drama is based on Robert Kolker’s powerfully empathetic book about the victims of a still-at-large Long Island serial killer believed to" +
            " have butchered between 10 and 16 female sex workers — whose bodies lay for years on a stretch of Gilgo Beach. Garbus focuses on the conflict between a working-class mother (Amy Ryan) whose oldest daughter has disappeared and the " +
            "Suffolk County Police — led by a grave, empty suit (Gabriel Byrne) — who don’t exactly put themselves out for missing “hookers.” The film lacks the scope of Kolker’s book, but in tracing a link between murderous misogyny and" +
            " patriarchal indifference it leaves you bereft (Why aren’t they acting like committed TV cops?) and then outraged. It’s an anti-police procedural.",
           "https://pyxis.nymag.com/v1/imgs/bf6/6d2/2745a402ab427074b6958ea2b9fbb18e20-12-lost-girls.rhorizontal.w700.jpg"),

            new Movie("Blow the Man Down",5,2020,"This one didn’t open theatrically, so once upon a time it probably wouldn’t have qualified for this list. But screw it, we live in extraordinary times — " +
            "and besides, this atmospheric murder " +
            "thriller set in a small New England fishing village is the kind of artfully mounted, suspenseful little charmer they don’t really make anymore, so it feels extra special. Two cash-strapped sisters, struggling to hold onto their " +
            "house in the wake of their mom’s death, find themselves in the middle of what appears to be an elaborate, twisted conspiracy involving the town brothel and a gaggle of old-timers with some dark secrets. The central mystery itself " +
            "is interesting, but the main attractions here are the colorful cast of characters and the compelling sense of place established by writer-directors Bridget Savage Cole and Danielle Krudy.",
           "https://pyxis.nymag.com/v1/imgs/a46/641/06904071a01ccbe9b57bd1589d9350866a-blow-the-man-down.rhorizontal.w700.jpg"),

            new Movie("Bacurau",3,2017,"A rural village in the sertão comes under attack in this film from Juliano Dornelles and Kleber Mendonça Filho. To say more about the culprits would constitute a " +
            "spoiler, but rest assured that Udo Kier is involved. Bacurau is a blood-pumping exploitation riff and a ferocious anti-colonialist protest, a movie in which a ragtag, uniquely Brazilian settlement proves itself to be more resilient" +
            " than any corrupt politician or rapacious outsider. As an inadvertent coronavirus-era release, it also offers a message that’s the perfect mix of encouraging and unsettling — that communities can pull together where governments fail," +
            " but that a sense of community has to be earned.","https://pyxis.nymag.com/v1/imgs/92c/033/5fddd4bd6561948b3444716c30558cafcc-16-bacurao-cannes.rhorizontal.w700.jpg"),

            new Movie("Super Intellligence",5,2020,"Not a lot is known about Melissa McCarthy’s latest collaboration with Ben Falcone, her " +
            "husband and producing partner. What we do know for sure is that McCarthy will play Carol Peters, who is chosen by the government to be observed by a superintelligent " +
            "A.I. with the voice of James Corden, a situation that will undoubtedly set in motion a series of wacky mishaps. The movie is slated to be released on the new streaming" +
            " service, HBO Max, so you won’t even have to leave your house to sit back and watch McCarthy’s particular brand of hilarity ensue.",
            "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/76th-annual-golden-globe-awards-pictured-melissa-mccarthy-news-photo-1585754301.jpg?resize=768:*"),

            new Movie("Free Guy",4,2020,"When a certain unnamed movie in early 2019 tried to explore what happens when a video game character " +
            "becomes aware of his situation (no spoilers here!), it was a disastrous flop. Free Guy, however, appears to be taking a more palatable approach to a similar plot: Ryan Reynolds" +
            " plays a video game character who becomes sentient and attempts to become the game-saving hero before the entire game is taken offline. If the trailer is any indication, it’ll be" +
            " full of Deadpool-style humor, and we’ll get to see Jodie Comer as something other than a stylish serial killer (though, she's still equipped with a Villanelle-approved accent and " +
            "wig)","https://m.media-amazon.com/images/M/MV5BYTNjNzFiZTItNDM5NS00ODBhLTk5NmMtYzUyZWRmOWJjOTI3XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_UX182_CR0,0,182,268_AL_.jpg")

    };


    public MoviesLab(){
        finalMovieGenerator(actionMovies,actionMovieList,actionmoviepposterurl);//actionGenerator();
        finalMovieGenerator(comedymovies,comedyMovieList,comedyMoviesPoster);//comedyGenerator();
        finalMovieGenerator(dramaMovies,dramaMovieList,dramaMoviesPoster);//DramaGenerator();
    }


////This method is added cos at the time when the app was first designed the images we use were not good enough for poster images and we didnt want to remove them so we decided to create dis
    //method to add poster images
    public void addPosterImages(String[] movieUrl, List<Movie> container){
        for(int i = 0; i < movieUrl.length ; i++){
            Movie movie;
            movie = container.get(i);
            movie.setPosterImages(movieUrl[i]);
        }
    }

    private void movieGenerator(Movie[] movieArray, List<Movie> movieContainer){
        movieContainer.addAll(Arrays.asList(movieArray));
    }

    private void finalMovieGenerator(Movie[] movieArray, List<Movie> movieContainer,String[] movieposter){
        movieGenerator(movieArray,movieContainer);
        addPosterImages(movieposter,movieContainer);
    }


    public List<Movie> getActionMovieList(){
        return actionMovieList;
    }

    public List<Movie> getComedyMovieList(){
        return comedyMovieList;
    }

    public List<Movie> getDramaMovieList(){
        return dramaMovieList;
    }



}
