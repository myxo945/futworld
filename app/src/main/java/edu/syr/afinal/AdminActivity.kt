package edu.syr.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        // Declare all the buttons in admin's main page
        val addTournamentButton = findViewById<Button>(R.id.addTournamentButton)
        val editTournamentButton = findViewById<Button>(R.id.editTournamentButton)
        val updateStatsButton = findViewById<Button>(R.id.updateStatsButton)
        val updateInfoButton = findViewById<Button>(R.id.updateInfoButton)

        // Setup the buttons' destination
        addTournamentButton.setOnClickListener {
            startActivity(Intent(this, AddTournamentActivity::class.java))
        }

    }
}