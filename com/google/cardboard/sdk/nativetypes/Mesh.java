package com.google.cardboard.sdk.nativetypes;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Mesh {
    public long indices;
    public int nIndices;
    public int nVertices;
    public long uvs;
    public long vertices;

    public Mesh(long j, int i, long j2, long j3, int i2) {
        this.indices = j;
        this.nIndices = i;
        this.vertices = j2;
        this.uvs = j3;
        this.nVertices = i2;
    }
}
