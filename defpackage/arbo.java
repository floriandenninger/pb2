package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arbo extends aonm implements aooz {
    public static final arbo a;
    private static volatile aopf o;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public aqyg i;
    public int j;
    public int k;
    public aqyg l;
    public int m;
    public aqyg n;
    private byte p = 2;

    static {
        arbo arboVar = new arbo();
        a = arboVar;
        aonm.registerDefaultInstance(arbo.class, arboVar);
    }

    private arbo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0006\u0011\f\u0000\u0000\u0003\u0006င\u0000\u0007င\u0001\bင\u0002\tင\u0003\nင\u0007\u000bင\b\fင\n\rᐉ\u0006\u000eᐉ\t\u000fᐉ\u000b\u0010င\u0004\u0011င\u0005", new Object[]{"b", "c", "d", "e", "f", "j", "k", "m", "i", "l", "n", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arbo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (arbo.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
