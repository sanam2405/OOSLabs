class Date
{
        int day,month,year;
	Date(int day)
        {
                this.day = day;
                this.month = 01;
                this.year = 1970;
        }

        Date(int day, int month)
        {
                this.day  = day;
                this.month = month;
                this.year = 1970;
        }

        Date(int day, int month, int year)
        {
                this.day = day;
                this.month = month;
                this.year = year;
        }

        boolean checkLeapYear(int year)
        {
                if(year%400==0)
                return true;
                else if(year % 100 == 0)
                return false;
                else if(year%4==0)
                return true;
                else
                return false;
        }

        void nextDate()
        {
                int d,m,y;
                if(checkLeapYear(year))
                {
                        if(month == 2)
                        {
                                if(day == 29)
                                {
                                        d = 1;
                                        m = 3;
                                        y = year;
                                }
                                else
                                {
                                        d = day+1;
                                        m = month;
                                        y = year;
                                }
                        }

                        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                        {
                                if(day == 31)
                                {
                                        d = 1;
                                        if(month == 12)
                                        {
                                                m = 1;
                                                y = year+1;
                                        }
                                        else
                                        {
                                                m = month+1;
                                                y = year;
                                        }
                                }

                                else
                                {
                                        d = day+1;
                                        m = month;
                                        y = year;
                                }
                        }

                        else
                        {
                                        if(day==30)
                                        {
                                                d = 1;
                                                m = month+1;
                                                y = year;
                                        }

                                        else
                                        {
                                                d = day+1;
                                                m = month;
                                                y = year;
                                        }
                        }
                }

                else
                {
                        if(month == 2)
                        {
                                if(day == 28)
                                {
                                        d = 1;
                                        m = 3;
                                        y = year;
                                }
                                else
                                {
                                        d = day+1;
                                        m = month;
                                        y = year;
                                }
                        }

                        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                        {
                                if(day == 31)
                                {
                                        d = 1;
                                        if(month == 12)
                                        {
                                                m = 1;
                                                y = year+1;
                                        }
                                        else
                                        {
                                                m = month+1;
                                                y = year;
                                        }
                                }

                                else
                                {
                                        d = day+1;
                                        m = month;
                                        y = year;
                                }
                        }

                        else
                        {
                                        if(day==30)
                                        {
                                                d = 1;
                                                m = month+1;
                                                y = year;
                                        }

                                        else
                                        {
                                                d = day+1;
                                                m = month;
                                                y = year;
                                        }
                        }
                }
                System.out.println("The next date is : "+d+"/"+m+"/"+y);
        }

        void previousDate()
        {
                int d,m,y;
                if(checkLeapYear(year))
                {
                        if(month == 3)
                        {
                                if(day == 1)
                                {
                                        d = 29;
                                        m = 2;
                                        y = year;
                                }
                                else
                                {
                                        d = day-1;
                                        m = month;
                                        y = year;
                                }
                        }

                        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                        {
                                if(day == 1)
                                {
                                        d = 30;
                                        if(month == 1)
                                        {
                                               d = 31;
		                               m = 12;
                                               y = year-1;
                                        }
                                        else
                                        {
                                                m = month-1;
                                                y = year;
                                        }
                                }

                                else
                                {
                                        d = day-1;
                                        m = month;
                                        y = year;
                                }
                        }

                        else
                        {
                                        if(day==1)
                                        {
                                                d = 31;
                                                m = month-1;
                                                y = year;
                                        }

                                        else
                                        {
                                                d = day-1;
                                                m = month;
                                                y = year;
                                        }
                        }
                }

                else
                {
	                if(month == 3)
                        {
                                if(day == 1)
                                {
                                        d = 28;
                                        m = 2;
                                        y = year;
                                }
                                else
                                {
                                        d = day-1;
                                        m = month;
                                        y = year;
                                }
                        }

                        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                        {
                                if(day == 1)
                                {
                                        d = 30;
                                        if(month == 1)
                                        {
                                               d = 31;
		                               m = 12;
                                               y = year-1;
                                        }
                                        else
                                        {
                                                m = month-1;
                                                y = year;
                                        }
                                }

                                else
                                {
                                        d = day-1;
                                        m = month;
                                        y = year;
                                }
                        }

                        else
                        {
                                        if(day==1)
                                        {
                                                d = 31;
                                                m = month-1;
                                                y = year;
                                        }

                                        else
                                        {
                                                d = day-1;
                                                m = month;
                                                y = year;
                                        }
                        }
	}
                System.out.println("The next date is : "+d+"/"+m+"/"+y);
        }

        public static void main(String args[])
        {
                Date obj = new Date(29,02,2000);
                obj.nextDate();
		obj.previousDate();
        }
}
