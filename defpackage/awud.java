package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awud extends aonm implements aooz {
    public static final awud a;
    public static final aonk b;
    private static volatile aopf o;
    public int c;
    public awnd d;
    public boolean f;
    public float g;
    public boolean k;
    public int l;
    public int m;
    public int n;
    private byte p = 2;
    public String e = "";
    public aony h = emptyProtobufList();
    public aony i = emptyProtobufList();
    public String j = "";

    static {
        awud awudVar = new awud();
        a = awudVar;
        aonm.registerDefaultInstance(awud.class, awudVar);
        b = aonm.newSingularGeneratedExtension(awpu.a, awudVar, awudVar, null, 220721894, aoqn.MESSAGE, awud.class);
    }

    private awud() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0007\u001b\bဈ\u0006\tဇ\u0007\nင\b\u000bင\t\fင\n\rЛ", new Object[]{"c", "d", "e", "f", "g", "h", awtx.class, "j", "k", "l", "m", "n", "i", awts.class});
            case NEW_MUTABLE_INSTANCE:
                return new awud();
            case NEW_BUILDER:
                return new aone((char[][]) null, (float[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (awud.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
