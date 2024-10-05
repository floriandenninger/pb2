package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awtz extends aonm implements aooz {
    public static final awtz a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public awos d;
    public int e;
    public double f;
    public int g;
    public boolean h;
    public int i;
    private byte k = 2;

    static {
        awtz awtzVar = new awtz();
        a = awtzVar;
        aonm.registerDefaultInstance(awtz.class, awtzVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awtzVar, awtzVar, null, 220544256, aoqn.MESSAGE, awtz.class);
    }

    private awtz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0004က\u0003\u0006ဌ\u0005\u0007ဇ\u0006\bင\u0007", new Object[]{"c", "d", "e", awnx.o, "f", "g", awnx.p, "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new awtz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (awtz.class) {
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
