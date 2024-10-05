package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class audc extends aonm implements aooz {
    public static final audc a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    public boolean g;
    private apxf i;
    private aulq j;
    private aota k;
    private byte l = 2;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public String f = "";

    static {
        audc audcVar = new audc();
        a = audcVar;
        aonm.registerDefaultInstance(audc.class, audcVar);
        b = aonm.newSingularGeneratedExtension(aulp.a, audcVar, audcVar, null, 54681060, aoqn.MESSAGE, audc.class);
    }

    private audc() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0002\u0005\u0001Л\u0002ဈ\u0000\u0004Л\u0005ဇ\u0002\bᐉ\u0005\u000bᐉ\u0003\fᐉ\u0004", new Object[]{"c", "d", aude.class, "f", "e", audd.class, "g", "k", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new audc();
            case NEW_BUILDER:
                return new aone((char[]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (audc.class) {
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
