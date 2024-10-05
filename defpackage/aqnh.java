package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnh extends aonm implements aooz {
    public static final aqnh a;
    public static final aonk b;
    private static volatile aopf i;
    public int c;
    public int e;
    public int f;
    public int h;
    private byte j = 2;
    public String d = "";
    public String g = "";

    static {
        aqnh aqnhVar = new aqnh();
        a = aqnhVar;
        aonm.registerDefaultInstance(aqnh.class, aqnhVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqnhVar, aqnhVar, null, 362363524, aoqn.MESSAGE, aqnh.class);
    }

    private aqnh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0000\u0000\u0003ဈ\u0003\u0004ဌ\u0004\u0005င\u0005\u0007ဈ\u0006\bဌ\u0007", new Object[]{"c", "d", "e", aqnf.a(), "f", "g", "h", aqkw.l});
            case NEW_MUTABLE_INSTANCE:
                return new aqnh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqnh.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
