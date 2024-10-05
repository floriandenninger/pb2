package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awpi extends aonm implements aooz {
    public static final awpi a;
    public static final aonk b;
    private static volatile aopf k;
    public int c;
    public awpf d;
    public awnw e;
    public awnw f;
    public awpf g;
    public boolean h;
    public int i;
    public int j;
    private byte l = 2;

    static {
        awpi awpiVar = new awpi();
        a = awpiVar;
        aonm.registerDefaultInstance(awpi.class, awpiVar);
        b = aonm.newSingularGeneratedExtension(awqd.a, awpiVar, awpiVar, null, 277808098, aoqn.MESSAGE, awpi.class);
    }

    private awpi() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", awnx.k, "j", awnx.j});
            case NEW_MUTABLE_INSTANCE:
                return new awpi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (awpi.class) {
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
