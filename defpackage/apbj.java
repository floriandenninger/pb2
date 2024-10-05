package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbj extends aonm implements aooz {
    public static final apbj a;
    private static volatile aopf h;
    public int b;
    public int c;
    public int d;
    public int e = 1;
    public apbi f;
    public int g;

    static {
        apbj apbjVar = new apbj();
        a = apbjVar;
        aonm.registerDefaultInstance(apbj.class, apbjVar);
    }

    private apbj() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဉ\u0003\u0005ဌ\u0005\u0006ဌ\u0001\bင\u0002", new Object[]{"b", "c", apae.a(), "f", "g", apab.a(), "d", apah.a(), "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apbj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apbj.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
