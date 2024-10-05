package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnz extends aonm implements aooz {
    public static final aqnz a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    public boolean e;
    public boolean f;
    public aqmb g;
    private byte i = 2;
    public String d = "";

    static {
        aqnz aqnzVar = new aqnz();
        a = aqnzVar;
        aonm.registerDefaultInstance(aqnz.class, aqnzVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqnzVar, aqnzVar, null, 323685881, aoqn.MESSAGE, aqnz.class);
    }

    private aqnz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0000\u0002ဈ\u0003\u0007ဇ\u0007\bဇ\b\tဉ\t", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqnz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqnz.class) {
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
