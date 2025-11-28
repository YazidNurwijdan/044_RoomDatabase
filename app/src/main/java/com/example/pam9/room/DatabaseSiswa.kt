package com.example.questroom.repositori

import com.example.questroom.room.Siswa
import com.example.questroom.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)

}
