package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpv extends aonm implements aooz {
    public static final atpv a;
    private static volatile aopf l;
    public int b;
    public int c;
    public int e;
    public int f;
    public boolean g;
    public atpw h;
    public long j;
    public long k;
    public String d = "";
    public aony i = emptyProtobufList();

    static {
        atpv atpvVar = new atpv();
        a = atpvVar;
        aonm.registerDefaultInstance(atpv.class, atpvVar);
    }

    private atpv() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001င\u0000\u0002ဌ\u0003\u0003ဇ\u0004\u0004ဉ\u0005\u0005\u001b\u0006ဌ\u0002\u0007ဈ\u0001\bဂ\u0006\tဂ\u0007", new Object[]{"b", "c", "f", atnn.n, "g", "h", "i", atpw.class, "e", atnn.o, "d", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new atpv();
            case NEW_BUILDER:
                return new aone((boolean[][][]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (atpv.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
