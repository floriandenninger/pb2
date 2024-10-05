package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atrf extends aonm implements aooz {
    public static final atrf a;
    public static final aonk b;
    private static volatile aopf m;
    public int c;
    public int e;
    public long f;
    public atpg h;
    public long i;
    public atpf j;
    public String d = "";
    public aomf g = aomf.b;
    public String k = "";
    public String l = "";

    static {
        atrf atrfVar = new atrf();
        a = atrfVar;
        aonm.registerDefaultInstance(atrf.class, atrfVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, atrfVar, atrfVar, null, 130, aoqn.MESSAGE, atrf.class);
    }

    private atrf() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ည\u0003\u0005ဉ\u0004\u0006ဂ\u0005\u0007ဉ\u0006\bဈ\u0007\tဈ\b", new Object[]{"c", "d", "e", atrb.a(), "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new atrf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (atrf.class) {
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
