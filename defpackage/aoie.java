package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoie extends aonm implements aooz {
    public static final aoie a;
    private static volatile aopf m;
    public int b;
    public int c;
    public int e;
    public int g;
    public aogz h;
    public aogy i;
    public aohu j;
    public int k;
    public int l;
    public String d = "";
    public aony f = emptyProtobufList();

    static {
        aoie aoieVar = new aoie();
        a = aoieVar;
        aonm.registerDefaultInstance(aoie.class, aoieVar);
    }

    private aoie() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\"\n\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0005ဉ\u0005\u0006ဉ\u0006\tဌ\u0002\nဌ\n\f\u001b\rဌ\u000b\u000eဉ\t\"ဌ\u0004", new Object[]{"b", "c", aoic.b(), "d", "h", "i", "e", aogu.u, "k", aoib.b, "f", aoid.class, "l", aohq.b(), "j", "g", aogu.h});
            case NEW_MUTABLE_INSTANCE:
                return new aoie();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (aoie.class) {
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
