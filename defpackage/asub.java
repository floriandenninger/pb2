package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asub extends aonm implements aooz {
    public static final asub a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public int d;
    public boolean f;
    public boolean g;
    public float h;
    public int i;
    private aota k;
    private byte l = 2;
    public aomf e = aomf.b;

    static {
        asub asubVar = new asub();
        a = asubVar;
        aonm.registerDefaultInstance(asub.class, asubVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, asubVar, asubVar, null, 314600826, aoqn.MESSAGE, asub.class);
    }

    private asub() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဌ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005\u0007ဋ\u0006", new Object[]{"c", "d", aqkw.p, "e", "k", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asub();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (asub.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
