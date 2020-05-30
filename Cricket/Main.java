#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
 int total_number_of_balls,
  	  total_number_of_runs,
  	  number_of_runs_scored,
  	  number_of_balls_bowled;
  float number_of_overs,
  	  Total_no_of_over_finished,
  	  current_run_rate,
  	  total_run_rate;
  std::cin>>total_number_of_balls
    	  >>total_number_of_runs
    	  >>number_of_runs_scored
    	  >>number_of_balls_bowled;
  number_of_overs=total_number_of_balls/6;
  Total_no_of_over_finished=(number_of_balls_bowled/6)+((number_of_balls_bowled%6)*0.1);
  current_run_rate=(number_of_runs_scored/Total_no_of_over_finished);
  total_run_rate= total_number_of_runs/number_of_overs;
  std::cout<<number_of_overs<<"\n"
    	   <<Total_no_of_over_finished<<"\n";
  std::cout<<fixed<<setprecision(1)<<current_run_rate<<"\n";
  std::cout<<total_run_rate<<"\n";
  if(current_run_rate>=total_run_rate)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
  return 0;
}