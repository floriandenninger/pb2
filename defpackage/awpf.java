package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awpf extends aonm implements aooz {
    public static final awpf a;
    private static volatile aopf g;
    public int b;
    public int d;
    public boolean e;
    public int f;
    private awpg h;
    private byte i = 2;
    public aony c = emptyProtobufList();

    static {
        awpf awpfVar = new awpf();
        a = awpfVar;
        aonm.registerDefaultInstance(awpf.class, awpfVar);
    }

    private awpf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u001b\u0002ဌ\u0000\u0003ᐉ\u0001\u0004ဇ\u0002\u0005ဌ\u0003", new Object[]{"b", "c", awph.class, "d", awnx.h, "h", "e", "f", awnx.i});
            case NEW_MUTABLE_INSTANCE:
                return new awpf();
            case NEW_BUILDER:
                return new aone((int[]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (awpf.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
