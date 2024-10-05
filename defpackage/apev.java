package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apev extends aonm implements aooz {
    public static final apev a;
    private static volatile aopf k;
    public boolean b;
    public long c;
    public long d;
    public int e;
    public long f;
    public boolean g;
    public long h;
    public boolean i;
    public int j;
    private int l;

    static {
        apev apevVar = new apev();
        a = apevVar;
        aonm.registerDefaultInstance(apev.class, apevVar);
    }

    private apev() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0005ဂ\u0002\u0006ဇ\b\u0007ဂ\t\bဂ\u0006\u000bဌ\r\fဇ\f\u0010င\u0004", new Object[]{"l", "b", "c", "d", "g", "h", "f", "j", apew.a, "i", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apev();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (apev.class) {
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
