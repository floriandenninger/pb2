package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atxf extends aonm implements aooz {
    public static final atxf a;
    private static volatile aopf k;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public atxe f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;

    static {
        atxf atxfVar = new atxf();
        a = atxfVar;
        aonm.registerDefaultInstance(atxf.class, atxfVar);
    }

    private atxf() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", atxj.a, "h", atxj.c, "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new atxf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (atxf.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
