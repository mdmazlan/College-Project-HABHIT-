        package com.www.habhit.edu.bd;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.GridView;

        public class CourseSomuhMainActivity extends Activity {

            GridView gridView;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_habhit_main);

                gridView = (GridView) findViewById(R.id.grid_view);

                // Instance of ImageAdapter Class
                gridView.setAdapter(new ImageAdapter(this));

                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                        // Sending image id to FullScreenActivity

                        // passing array index
                        //i.putExtra("id", position);
                        if(position==0) {
                            Intent SoronioBaktitto = new Intent(getApplicationContext(), SoronioBaktittoActivity.class);
                            startActivity(SoronioBaktitto);
                        }else if (position==1) {
                            Intent ProtisthanPoriciti = new Intent(getApplicationContext(), ProtisthanPoricitiActivity.class);
                            startActivity(ProtisthanPoriciti);
                        }
                        else if (position==2) {
                            Intent ProtisthanPoriciti = new Intent(getApplicationContext(), HabhiterBishesottoActivity.class);
                            startActivity(ProtisthanPoriciti);
                        }
                        else if (position==3) {
                            Intent ProtisthanPoriciti = new Intent(getApplicationContext(),AmaderUddessoActivity.class);
                            startActivity(ProtisthanPoriciti);
                        }
                        else if (position==4) {
                            Intent ProtisthanPoriciti = new Intent(getApplicationContext(), DiplomaUdesshoActivity.class);
                            startActivity(ProtisthanPoriciti);
                        }
                        else if (position==5) {
                            Intent ProtisthanPoriciti = new Intent(getApplicationContext(), HabhitCourseSomuhoActivity.class);
                            startActivity(ProtisthanPoriciti);
                        }
                        else if (position==6) {
                            Intent ProtisthanPoriciti = new Intent(getApplicationContext(), DressCodeActivity.class);
                            startActivity(ProtisthanPoriciti);
                        }
                        else if (position==7) {
                            Intent ProtisthanPoriciti = new Intent(getApplicationContext(), HabhitCourseSomuhoActivity.class);
                            startActivity(ProtisthanPoriciti);
                        }
                        else if (position==8) {
                            Intent ProtisthanPoriciti = new Intent(getApplicationContext(), DressCodeActivity.class);
                            startActivity(ProtisthanPoriciti);
                        }
                        else if (position==9) {
                            Intent ProtisthanPoriciti = new Intent(getApplicationContext(), HabhitCourseSomuhoActivity.class);
                            startActivity(ProtisthanPoriciti);
                        }
                        else if (position==10) {
                            Intent ProtisthanPoriciti = new Intent(getApplicationContext(), DressCodeActivity.class);
                            startActivity(ProtisthanPoriciti);
                        }

                        //Toast.makeText(getApplicationContext(), "This is Position!: "+position,  Toast.LENGTH_LONG).show();

                    }
                });
            }
        }
