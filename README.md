ActivityFragmentSequence
========================
  
Log the sequence of Android Activity and Fragment: onCreate, onStart, onCreateView, onResume, onPause, onStop, onDestroy.  
  
  
05-14 13:32:51.307: D/TEST(4183): Activity: Before super.onCreate  
05-14 13:32:51.307: D/TEST(4183): Activity: After  super.onCreate  
05-14 13:32:51.317: D/TEST(4183): Activity: Before super.onStart  
05-14 13:32:51.317: D/TEST(4183): Fragment: Before super.onAttach  
05-14 13:32:51.317: D/TEST(4183): Fragment: After  super.onAttach  
05-14 13:32:51.317: D/TEST(4183): Fragment: Before super.onCreate  
05-14 13:32:51.317: D/TEST(4183): Fragment: After  super.onCreate  
05-14 13:32:51.317: D/TEST(4183): Fragment: Before super.onActivityCreated  
05-14 13:32:51.317: D/TEST(4183): Fragment: After  super.onActivityCreated  
05-14 13:32:51.317: D/TEST(4183): Fragment: Before super.onStart  
05-14 13:32:51.317: D/TEST(4183): Fragment: After  super.onStart  
05-14 13:32:51.317: D/TEST(4183): Activity: After  super.onStart  
05-14 13:32:51.317: D/TEST(4183): Activity: Before super.onResume  
05-14 13:32:51.327: D/TEST(4183): Activity: After  super.onResume  
05-14 13:32:51.327: D/TEST(4183): Fragment: Before super.onResume  
05-14 13:32:51.327: D/TEST(4183): Fragment: After  super.onResume  
05-14 13:33:05.417: D/TEST(4183): Activity: Before super.onPause  
05-14 13:33:05.417: D/TEST(4183): Fragment: Before super.onPause  
05-14 13:33:05.417: D/TEST(4183): Fragment: After  super.onPause  
05-14 13:33:05.417: D/TEST(4183): Activity: After  super.onPause  
05-14 13:33:05.577: D/TEST(4183): Activity: Before super.onStop  
05-14 13:33:05.577: D/TEST(4183): Fragment: Before super.onStop  
05-14 13:33:05.577: D/TEST(4183): Fragment: After  super.onStop  
05-14 13:33:05.577: D/TEST(4183): Activity: After  super.onStop  
05-14 13:33:05.577: D/TEST(4183): Activity: Before super.onDestroy  
05-14 13:33:05.577: D/TEST(4183): Fragment: Before super.onDestroyView  
05-14 13:33:05.577: D/TEST(4183): Fragment: After  super.onDestroyView  
05-14 13:33:05.577: D/TEST(4183): Fragment: Before super.onDestroy  
05-14 13:33:05.577: D/TEST(4183): Fragment: After  super.onDestroy  
05-14 13:33:05.577: D/TEST(4183): Fragment: Before super.onDetach  
05-14 13:33:05.577: D/TEST(4183): Fragment: After  super.onDetach  
05-14 13:33:05.577: D/TEST(4183): Activity: After  super.onDestroy  
