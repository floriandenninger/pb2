package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arjg extends aonm implements aooz {
    public static final arjg a;
    private static volatile aopf m;
    public int b;
    public arnb c;
    public long d;
    public long e;
    public int f;
    public float g;
    public int h;
    public aony i;
    public aony j;
    public aony k;
    public aony l;
    private byte n = 2;

    static {
        arjg arjgVar = new arjg();
        a = arjgVar;
        aonm.registerDefaultInstance(arjg.class, arjgVar);
    }

    private arjg() {
        emptyProtobufList();
        this.i = emptyProtobufList();
        this.j = emptyProtobufList();
        this.k = emptyProtobufList();
        this.l = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0004\u0001\u0001ᐉ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဋ\u0003\u0005ခ\u0004\u0006ဋ\u0005\b\u001b\n\u001b\u000b\u001b\f\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", arji.class, "j", atsc.class, "k", arjk.class, "l", arjm.class});
            case NEW_MUTABLE_INSTANCE:
                return new arjg();
            case NEW_BUILDER:
                return new aone((char[]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (arjg.class) {
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
