package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atou extends aonm implements aooz {
    public static final atou a;
    private static volatile aopf m;
    public int b;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;

    static {
        atou atouVar = new atou();
        a = atouVar;
        aonm.registerDefaultInstance(atou.class, atouVar);
    }

    private atou() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဂ\u0000\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0004\bဇ\u0005\tဌ\u0006\nင\u0007\u000bဇ\b", new Object[]{"b", "c", atow.class, "d", atov.class, "e", "f", "g", "h", "i", "j", aqjw.a(), "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new atou();
            case NEW_BUILDER:
                return new aone((char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (atou.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
