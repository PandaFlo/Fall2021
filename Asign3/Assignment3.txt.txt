(display "Hello World")
(newline)(newline)(newline)(newline)



;;Recursion
(define (find-and-remove x list)
(cond ((null? list) '())   ;returns if list is empty
((list? (car list)) (cons (find-and-remove x (car list)) (find-and-remove x (cdr list)))) ;recusion on embedded list
((eq? (car list) x) (find-and-remove x (cdr list))) 
(else
(cons (car list) (find-and-remove x (cdr list)))))) 

 
(define (find-and-replace x y list)
(cond ((null? list) '()) ;returns if list is empty
((list? (car list)) (cons (find-and-replace x y (car list)) (find-and-replace x y (cdr list)))) ;recusion on embedded list
((eq? (car list) x) (cons y (find-and-replace x y (cdr list)))) 
(else
(cons (car list) (find-and-replace x y (cdr list)))))) 

 
(define (find-and-absolute list)
(cond ((null? list) '()) ;returns if list is empty
((list? (car list)) (cons (find-and-absolute (car list)) (find-and-absolute (cdr list))))
(display (cons (abs(car list)) (find-and-absolute (cdr list))))))


;;Divide And Conquer
;;Bubble Sort Methods

(define bubbleSort (lambda (lst)
    (bubbleSortBy lst <=)) ;method call
)

(define bubbleSortBy (lambda (lst f) ; bubble the elements by given amount
    (if (not1? lst)
        lst
    (bubbleOnceBy (cons (car lst) (bubbleSortBy (cdr lst) f)) f))) ;return the result
)

(define bubbleOnceBy(lambda (lst f) ; bubble the elements by given amount
        (if (not1? lst)
            lst
            (let ((lst (swapBy lst f)))
                (cons (car lst) (bubbleOnceBy (cdr lst) f))))) ;return the result
)

(define not1? (lambda (lst)
     (or (null? lst) (null? (cdr lst))));;True if lst has an element left
) 

(define swapBy ; Swap elements w/ given number
    (lambda (lst f)
    (if (or (not1? lst) (f (car lst) (cadr lst)))
        lst
        (swap lst)))    ;swap the elements
)

(define swap (lambda (lst) ; Swap elements
        (if (not1? lst)
            lst                                             ; return lst
            (cons (cadr lst) (cons (car lst) (cddr lst))))); return swapped lst
)




;Test Cases


 (display '(list1))(newline)
 (define listA '(0 91 -6 23 0 14 3 0 -28 84 0 7 0 27 0 22 -59 0 -31))
 (display listA)
 (newline) (newline)
 
 (display '(Absolute Value) )
 (newline)
 (display (find-and-absolute listA) )
 (newline)(newline)
 
 (display '(target value: 0 to 1) )
 (newline)
 (display (find-and-replace 0 1 listA))
 (newline) (newline)
 
 (display '(target value: 0) )
 (newline)
 (display (find-and-remove 0 listA))
 (newline)(newline)
 
 (display '(Bubble Sort))
 (newline)
 (display (bubbleSort listA))
 
 (newline)(newline)
 (newline)(newline)
 
 (display '(list2))(newline)
 (define listB '(-32 7 37 55 -7 82 40 72 7 51 -4 1 54 7 -11 57 -60 7 64 -56 7))
 (display listB)
 (newline) (newline)
 
 (display '(Absolute Value) )
 (newline)
 (display (find-and-absolute listB) )
 (newline)(newline)
 
 (display '(target value: 7 to 2) )
 (newline)
 (display (find-and-replace 7 2 listB))
 (newline) (newline)
 
 (display '(target value: 7) )
 (newline) 
 (display (find-and-remove 7 listB))
 (newline)(newline)
 
 (display '(Bubble Sort))
 (newline)
 (display (bubbleSort listB))
 
 (newline)(newline)
 (newline)(newline)
 
 (display '(list3))(newline)
 (define listC '(14 3 -18 1 3 1 -30 3 -6 0 -10 3 8 -29 15 3 16 18 9 3 -1 3))
 (display listC)
 (newline) (newline)
 
 (display '(Absolute Value) )
 (newline)
 (display (find-and-absolute listC) )
 (newline)(newline)
 
 (display '(target value: 3 to 0) )
 (newline)
 (display (find-and-replace 3 0 listC))
 (newline) (newline)
 
 (display '(target value: 3) )
 (newline) 
 (display (find-and-remove 3 listC))
 (newline)(newline)
 
 (display '(Bubble Sort))
 (newline)
 (display (bubbleSort listC))
 
 (newline)(newline)
 (newline)(newline)
    
 (display '(list4))(newline)
 (define listD '(11 -21 11 -7 -25 13 16 -10 11 -17 -3 11 -14 -11 -16 -20 -19 11 -8 3 11))
 (display listD)
 (newline) (newline)
 
 (display '(Absolute Value) )
 (newline)
 (display (find-and-absolute listD) )
 (newline)(newline)
 
 (display '(target value: 11 to -41) )
 (newline)
 (display (find-and-replace 11 -41 listD))
 (newline) (newline)
 
 (display '(target value: 11) )
 (newline) 
 (display (find-and-remove 11 listD))
 (newline)(newline)
 
 (display '(Bubble Sort))
 (newline)
 (display (bubbleSort listD))
 
 (newline)(newline)
 (newline)(newline)
 
 (display '(list5))(newline)
 (define listE '(9  8 -16 8 11 -2 8 -25 -14 8 5 -3 17 8 8 14 -17 8 -26 -4 10 8))
 (display listE)
 (newline) (newline)
 
 (display '(Absolute Value) )
 (newline)
 (display (find-and-absolute listE) )
 (newline)(newline)
 
 (display '(target value: 8 to 9) )
 (newline)
 (display (find-and-replace 8 9 listE))
 (newline) (newline)
 
 (display '(target value: 8) )
 (newline) 
 (display (find-and-remove 8 listE))
 (newline)(newline)
 
 (display '(Bubble Sort))
 (newline)
 (display (bubbleSort listE))
 
 (newline)(newline)
 (newline)(newline)
 
 (display '(list6))(newline)
 (define listF '(-14 -7 -12 -4 -12 -26 -12 -27 20 -12 8 6 16 -12 -30 -12 -19 -29 15 -6 -12))
 (display listF)
 (newline) (newline)
 
 (display '(Absolute Value) )
 (newline)
 (display (find-and-absolute listF) )
 (newline)(newline)
 
 (display '(target value: -12 to 0) )
 (newline)
 (display (find-and-replace -12 0 listF))
 (newline) (newline)
 
 (display '(target value: -12) )
 (newline) 
 (display (find-and-remove -12 listF))
 (newline)(newline)
 
 (display '(Bubble Sort))
 (newline)
 (display (bubbleSort listF))
 
 (newline)(newline)
 (newline)(newline)
 
     (display '(list7))(newline)
 (define listG '(-21 2 -13 -5 -6 2 -8 10 13 2 -30 2 -2 2 -14 11 2 16 2 18 -27 2 -10))
 (display listG)
 (newline) (newline)
 
 (display '(Absolute Value) )
 (newline)
 (display (find-and-absolute listG) )
 (newline)(newline)
 
 (display '(target value: 2 to -2) )
 (newline)
 (display (find-and-replace 2 -2 listG))
 (newline) (newline)
 
 (display '(target value: 2) )
 (newline) 
 (display (find-and-remove 2 listG))
 (newline)(newline)
 
 (display '(Bubble Sort))
 (newline)
 (display (bubbleSort listG))
 
 (newline)(newline)
 (newline)(newline)
 
     (display '(list8))(newline)
 (define listH '(2 7 7 8 -22 -2 19 7 16 7 10 5 -30 14 7 9 3 -1 7 -8 -12 7 7))
 (display listH)
 (newline) (newline)
 
 (display '(Absolute Value) )
 (newline)
 (display (find-and-absolute listH) )
 (newline)(newline)
 
 (display '(target value: 7 to -1) )
 (newline)
 (display (find-and-replace 7 -1 listH))
 (newline) (newline)
 
 (display '(target value: 7) )
 (newline) 
 (display (find-and-remove 7 listH))
 (newline)(newline)
 
 (display '(Bubble Sort))
 (newline)
 (display (bubbleSort listH))
 
 (newline)(newline)
 (newline)(newline)
 
 (display '(list9))(newline)
 (define listI '(-8 2 -12 -4 2 12 18 1 2 -19 2 19 -22 2 -13 -25 20 15 -3 2))
 (display listI)
 (newline) (newline)
 
 (display '(Absolute Value) )
 (newline)
 (display (find-and-absolute listI) )
 (newline)(newline)
 
 (display '(target value: 2 to 77) )
 (newline)
 (display (find-and-replace 2 77 listI))
 (newline) (newline)
 
 (display '(target value: 2) )
 (newline) 
 (display (find-and-remove 2 listI))
 (newline)(newline)
 
 (display '(Bubble Sort))
 (newline)
 (display (bubbleSort listI))
 
 (newline)(newline)
 (newline)(newline)
 
 (display '(list10))(newline)
 (define listJ '(-12 0 -5 2 0 -26 0 -16 -23 0 -29 -21 -27 0 0 1 8 0 19 10 -4 0))
 (display listJ)
 (newline) (newline)
 
 (display '(Absolute Value) )
 (newline)
 (display (find-and-absolute listJ) )
 (newline)(newline)
 
 (display '(target value: 0 to -1) )
 (newline)
 (display (find-and-replace 0 -1 listJ))
 (newline) (newline)
 
 (display '(target value: 0) )
 (newline) 
 (display (find-and-remove 0 listJ))
 (newline)(newline)
 
 (display '(Bubble Sort))
 (newline)
 (display (bubbleSort listJ))
 
 (newline)(newline)
 (newline)(newline)