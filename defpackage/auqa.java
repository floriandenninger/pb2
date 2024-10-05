package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auqa extends aonm implements aooz {
    public static final auqa a;
    private static volatile aopf e;
    public int b;
    public aqyg c;
    private apmh f;
    private apmh g;
    private aota h;
    private byte i = 2;
    public aony d = emptyProtobufList();

    static {
        auqa auqaVar = new auqa();
        a = auqaVar;
        aonm.registerDefaultInstance(auqa.class, auqaVar);
    }

    private auqa() {
        aomf aomfVar = aomf.b;
    }

    public final void a() {
        aony aonyVar = this.d;
        if (aonyVar.c()) {
            return;
        }
        this.d = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", aulq.class, "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new auqa();
            case NEW_BUILDER:
                return new aone((float[]) null, (float[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (auqa.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
