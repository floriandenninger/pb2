package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atrl extends aonm implements aooz {
    public static final atrl a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    public String d = "";
    public int e;
    public long f;
    public long g;

    static {
        atrl atrlVar = new atrl();
        a = atrlVar;
        aonm.registerDefaultInstance(atrl.class, atrlVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, atrlVar, atrlVar, null, 39, aoqn.MESSAGE, atrl.class);
    }

    private atrl() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"c", "d", "e", avxt.a(), "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atrl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atrl.class) {
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
