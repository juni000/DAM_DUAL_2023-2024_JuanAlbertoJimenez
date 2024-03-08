cd D:\Juan_Alberto_DAM_C
mkdir Actividades
for ($i = 1; $i -lt 4 ; $i++) {
    mkdir Actividades\Unidad$i
}
for ($i = 1; $i -lt 4 ; $i++) {
    del Actividades\Unidad$i
}
del Actividades